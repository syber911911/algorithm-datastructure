package Stack;

import java.util.Arrays;

public class ArrayStack {
    private final int[] arr = new int[16];
    private int top = -1;

    public ArrayStack() {

    }

    public void push(int data) {
        if (isFull()) throw new RuntimeException("stack is full");
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("stack is empty");
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("stack is empty");
        return arr[top];
    }

    public boolean isFull() {
        return arr.length - 1 == top;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(1);
        arrayStack.push(5);
        System.out.println(Arrays.toString(arrayStack.arr));
    }
}
