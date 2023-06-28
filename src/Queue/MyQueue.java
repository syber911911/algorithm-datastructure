package Queue;

import java.util.Arrays;

public class MyQueue {
    private final int[] arr = new int[4];
    private int front = -1;
    private int rear = -1;

    public MyQueue() {

    }

    public void enQueue(int data) {
        if (rear == arr.length - 1) {
            throw new RuntimeException("queue is full");
        }
        arr[++rear] = data;
    }

    public int deQueue() {
        if (front == rear) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[++front];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front + 1];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(1);
        myQueue.enQueue(3);
        myQueue.enQueue(5);
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(Arrays.toString(myQueue.arr));
    }
}
