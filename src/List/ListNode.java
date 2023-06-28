package List;


public class ListNode {
    private Integer data; // Node Data
    private ListNode link; // 다른 Node 를 참조할 Link Node

    public ListNode() {
        data = null;
        link = null;
    }
    public ListNode(int item) {
        data = item;
        link = null;
    }

    public ListNode(int item, ListNode nextNode) {
        data = item;
        link = nextNode;
    }

    public int getData() {
        return this.data;
    }

    public ListNode getLink() {
        return this.link;
    }
    public void setLink(ListNode newNode) {
        this.link = newNode;
    }
}
