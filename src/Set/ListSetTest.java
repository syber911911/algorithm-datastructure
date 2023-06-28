package Set;

public class ListSetTest {
    public static void main(String[] args) {
        ListSet <Integer> setA = new <Integer> ListSet();
        ListSet <Integer> setB = new <Integer> ListSet();
        setA.insert(1);
        setA.insert(2);
        setA.insert(2);
        setA.display();

        setB.insert(3);
        setB.insert(4);
        setA.union(setB);
        setA.display();
    }
}
