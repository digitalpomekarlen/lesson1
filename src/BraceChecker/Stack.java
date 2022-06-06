package BraceChecker;

public class Stack {

    private int size;

    private char[] stackArray;

    private int top;

    public Stack(int max) {
        size = max;
        stackArray = new char[size];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
