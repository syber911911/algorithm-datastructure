package Deque;

import java.util.ArrayList;

public class Deque {
    static ArrayList<Integer> items = new ArrayList<>();

    public void addRear(int item) {
        items.add(item);
    }

    public int deletFront() {
        int temp = items.get(0);
        items.remove(0);
        return temp;
    }

    public void addFront(int item) {
        items.add(0, item);
    }

    public int deletRear() {
        int temp = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return temp;
    }
}
