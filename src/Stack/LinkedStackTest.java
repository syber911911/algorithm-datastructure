package Stack;

public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.display();
        stack.push(7);
        stack.display();
        stack.push(8);
        stack.display();
    }
}