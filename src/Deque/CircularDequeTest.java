package Deque;

import java.util.Arrays;

public class CircularDequeTest {
    public static void main(String[] args) {
        CircularDeque deque = new CircularDeque();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addRear(1);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addRear(2);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addRear(3);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addRear(4);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletFront();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addFront(5);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addFront(6);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletRear();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletRear();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletRear();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletRear();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletRear();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.addFront(1);
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        deque.deletRear();
        System.out.printf("front: %d, rear: %d\n", deque.front, deque.rear);
        System.out.println(Arrays.toString(deque.items));
    }
}
