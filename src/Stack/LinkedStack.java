package Stack;

public class LinkedStack {
    Node top;

    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.linkNode(top);
        top = newNode;
    }

    public int peek() {
        return top.getData();
    }

    public int pop() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        else {
            int item = peek();
            top = top.getNextNode();
            return item;
        }
    }

    public void display() {
        if(isEmpty()) System.out.println("LinkedStack Top ---> null");
        else {
            System.out.print("LinkedStack Top ---> ");
            Node node = top;
            while(node != null) {
                System.out.printf("%d ----> ", node.getData());
                node = node.getNextNode();
            }
            System.out.println("null");
        }
    }
}
