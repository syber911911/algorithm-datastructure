package Stack;

public class Node {
    private int data;
    private Node nextNode;
    public Node(){

    }
    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void linkNode(Node node) {
        nextNode = node;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }
}
