import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    private int Size, top;
    private int[] StackArray;

    public Stack(int size)
    {
        if (size <= 0) throw new IllegalArgumentException("Size must be greater then zero");
        StackArray = new int[size];
        top = -1;
    }

    public void push(int item)
    {
        if (StackArray.length == top) throw new EmptyStackException();
        StackArray[++top] = item;
    }

    public int pop()
    {
        if(top == -1) throw new EmptyStackException();
        return StackArray[top--];
    }

    public int peek()
    {
        if(top == -1) throw new EmptyStackException();
        return StackArray[top];
    }

    public boolean isEmpty()
    {
        if(top == -1) return true;
        return false;
    }

    public int search(int item)
    {
        for(int i = 0; i < top; i++)
        {
            if(StackArray[top - i] == item)
                return i + 1;
        }
        return -1;
    }
}
