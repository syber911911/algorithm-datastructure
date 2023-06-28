package Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFront(1);
        deque.addFront(3);
        deque.addRear(2);
        deque.addRear(6);
        System.out.println(deque.deletFront());
        System.out.println(deque.deletRear());
        System.out.println(deque.items);
    }
}
