package Set;

import java.util.ArrayList;

public class ListSet<T>{
    ArrayList items = new ArrayList();

    public int size() {
        return items.size();
    }

    public void display() {
        System.out.println(items);
    }

    public boolean contains(T item) {
        return items.contains(item);
    }

    public void insert(T item){
        if(items.contains(item) == false) items.add(item);
    }

    public T delete(T item){
        if(items.contains(item) == true) {
            items.remove(item);
        }
        return item;
    }

    public ListSet union(ListSet setB){
        ListSet setC = new ListSet();
        setC.items = items;
        for(int i = 0; i < setB.size(); i++){
            if(setC.contains(setB.items.get(i)) == false) setC.insert(setB.items.get(i));
        }
        return setC;
    }
}

