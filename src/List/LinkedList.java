package List;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = new ListNode();
    }

    public void clear() {
        head.setLink(null);
    }

    public boolean isEmpty() {
        if (head.getLink() == null) {
            return true;
        } else return false;
    }

    public ListNode getNode(int index) {
        if (index < 0 || isEmpty()) return null;
        ListNode node = head;
        while (index >= 0 && node.getLink() != null) {
            node = node.getLink();
            index--;
        }
        return node;
    }

    public void append(int item) {
        ListNode node = head;
        while (node.getLink() != null) {
            node = node.getLink();
        }
        ListNode newNode = new ListNode(item);
        node.setLink(newNode);
    }

    public void insert(int index, int item) {
        ListNode beforeNode = this.getNode(index - 1); // Get a Node before index to insert
        if (beforeNode == null) head.setLink(new ListNode(item, head.getLink())); // insert to zero index
        else { // insert to middle index
            ListNode newNode = new ListNode(item, beforeNode.getLink()); // make a newNode, that is pointing beforeNode's link
            beforeNode.setLink(newNode); // Point beforeNode to newNode
        }
    }

    public void delete(int index) {
        ListNode beforeNode = this.getNode(index - 1); // Get a Node before index to insert
        if (beforeNode == null) { // delete zero index node
            if (head.getLink() != null) head.setLink(head.getLink().getLink()); // if headNode is not point null, headNode points to the node pointed by the headNode. we can change the logic to "if(!isEmpty())"
        } else if (beforeNode.getLink() != null) beforeNode.setLink(beforeNode.getLink().getLink()); // beforeNode is point null, that means the node does not exist at the index we want to delete.
    }

    public void display() {
        if (isEmpty()) System.out.println("LinkedList Head ---> null");
        else {
            System.out.print("LinkedList Head ---> ");
            ListNode node = head.getLink();
            while (node != null) {
                System.out.printf("%d ----> ", node.getData());
                node = node.getLink();
            }
            System.out.println("null");
        }
    }
}
