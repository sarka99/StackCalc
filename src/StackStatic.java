import java.util.Arrays;
import java.util.EmptyStackException;

public class StackStatic<T> extends Stack<T> {
    public StackStatic(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = -1;
    }
    @Override
    public void push(T value) throws StackOverflowError{
        if(top == size-1){
            throw new StackOverflowError("The Stack is Full");
        }
        top++;
        stack[top] = value;

    }
    @Override
    public T pop() throws EmptyStackException {
        if(top < 0){
            throw new EmptyStackException();
        }
        T elmntToPop = stack[top];

        stack[top] = null;
        top--;

        return elmntToPop;
    }
    @Override
    public String toString() {
        return "StackStatic{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                ", top=" + top +
                '}';
    }
}
