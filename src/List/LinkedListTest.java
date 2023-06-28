package List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.display();
        list.append(1); list.append(3); list.append(5);
        list.display();
        list.insert(0, 7);
        list.display();
        list.insert(8, 9);
        list.display();
        list.insert(2, 11);
        list.display();
        list.delete(10);
        list.display();
        list.delete(5);
        list.display();
        list.delete(1);
        list.display();
        list.delete(0);
        list.display();
        list.clear();
        list.display();
    }
}
