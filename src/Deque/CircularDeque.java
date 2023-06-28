package Deque;

public class CircularDeque {
    int front = 0;
    int rear = 0;
    int maxDequeSize = 8;
    int[] items = new int[maxDequeSize];

    public boolean isEmpty(){
        return front == rear;
    }
    public boolean isFull(){
        return front == (rear + 1) % maxDequeSize;
    }
    public void clear(){
        front = rear;
    }
    public void addRear(int val){
        if(!CircularDeque.this.isFull()){
            rear = (rear + 1) % maxDequeSize;
            items[rear] = val;
        }
    }
    public int deletFront(){
        if(!CircularDeque.this.isEmpty()){
            int temp = items[front];
            items[front] = 0;
            front = (front + 1) % maxDequeSize;
            return temp;
        }
        else{
            return Integer.MAX_VALUE;
        }
    }
    public int getFront(){
        if(!CircularDeque.this.isEmpty()){
            return items[(front + 1) % maxDequeSize];
        }
        else{
            return Integer.MAX_VALUE;
        }
    }
    public void addFront(int val){
        if(!CircularDeque.this.isFull()){
            items[front] = val;
            front = (front - 1 + maxDequeSize) % maxDequeSize;
        }
    }
    public int deletRear(){
        if(!CircularDeque.this.isEmpty()){
            int temp = items[rear];
            items[rear] = 0;
            //rear = (rear - 1 + maxDequeSize) % maxDequeSize;
            if(rear == 0) rear = maxDequeSize - 1;
            else rear -= 1;
            return temp;
        }
        else{
            return Integer.MAX_VALUE;
        }
    }
}
