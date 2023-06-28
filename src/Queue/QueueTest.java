package Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(7);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
