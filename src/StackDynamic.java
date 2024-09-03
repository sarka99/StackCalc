import java.util.Arrays;
import java.util.EmptyStackException;

public class StackDynamic <T> extends Stack<T>{
    public StackDynamic() {
        this.size = 10;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }
    public StackDynamic(int size) {
        this.size = size;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    @Override
    public void push(T value) throws StackOverflowError {
        if(top == size-1){
            resize(size*2);
        }
        top++;
        stack[top] = value;

    }
    private void resize(int newSize){
        T[] newStack = (T[]) new Object[newSize];
        System.arraycopy(stack,0,newStack,0,top+1);
        stack = newStack;
        size = newSize;
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
        return "StackDynamic{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                ", top=" + top +
                '}';
    }
}
