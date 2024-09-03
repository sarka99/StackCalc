import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new StackDynamic<>();
        System.out.println("HP-35 pocket calculator");
        boolean run = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2, res;
        while (run) {
            System.out.print(" > ");
            String input = br.readLine();
            switch (input) {
                case "+":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    res = num1 + num2;
                    stack.push(res);
                    num1 = 0;
                    num2 = 0;
                    res = 0;
                    break;
                case "-":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    res = num1 - num2;
                    stack.push(res);
                    num1 = 0;
                    num2 = 0;
                    res = 0;
                    break;

                case "*":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    res = num1 * num2;
                    stack.push(res);
                    num1 = 0;
                    num2 = 0;
                    res = 0;
                    break;

                case "/":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    res = num1 / num2;
                    stack.push(res);
                    num1 = 0;
                    num2 = 0;
                    res = 0;
                    break;

                case "":
                    run = false;
                    break;

                default:
                    Integer nr = Integer.parseInt(input);
                    stack.push(nr);
                    break;
            }
        }
        System.out.printf("The result is: %d\n\n", stack.pop());
        System.out.printf("I love reverse polish notation, don't you?\n");
    }
}
