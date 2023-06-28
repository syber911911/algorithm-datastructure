package List;

public class MyLinkedList {
    private Node start;
    private static class Node {
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }
    }

    public void add(int data) {
        if (start == null) start = new Node(data);
        else {
            Node head = start;
            while (head.link != null) {
                head = head.link;
            }
            head.link = new Node(data);
        }
    }

    public int remove(int idx) {
        if (idx == 0) {
            int value = start.data;
            start = start.link;
            return value;
        }
        int i = 0;
        Node head = start;
        Node prev = start;
        while (i < idx) {
            prev = head;
            head = head.link;
            i++;
        }
        prev.link = head.link;
        return head.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node head = start;
        while (head != null) {
            sb.append(head.data);
            if (head.link != null) {
                sb.append(", ");
            }
            head = head.link;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        System.out.println(linkedList.remove(0));
        System.out.println(linkedList);
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList);
        System.out.println(linkedList.remove(0));
        System.out.println(linkedList);
    }
}
