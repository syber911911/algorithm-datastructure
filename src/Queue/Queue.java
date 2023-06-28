package Queue;


import java.util.ArrayList;

// (데이터, 우선순위) --> 데이터 == 우선순위
// 선형 큐 enqueue 동일, dequeue <--- 우선순위 판별이 필요
// 우선순위를 판별 할 함수가 필요!
public class Queue {
    public static ArrayList<Integer> items = new ArrayList<>();
    public static int maxIndex;

    public static boolean isEmpty() {
        if(items.size() == 0) return true;
        else return false;
    }

    public static void enqueue(int item) {
        items.add(item);
    }

    public static boolean findMaxIndex() {
        if(isEmpty()) {
            return false;
        }
        else{
            maxIndex = 0;
            for(int i = 1; i < items.size(); i++) {
                if(items.get(i) > items.get(maxIndex)) {
                    maxIndex = i;
                }
            }
            return true;
        }
    }

    public int dequeue() {
        if(findMaxIndex()) {
            int temp = items.get(maxIndex);
            items.remove(maxIndex);
            return temp;
        }
        else {
            return Integer.MIN_VALUE;
        }
    }
}
