package stacksandqueues;

public class Queue {

    Node front;
    Node back;

    public void enqueue(int numberVal) {
        if (front == null){
            front = new Node(numberVal, null);
            back = front;
        } else {
            back.next = new Node(numberVal, null);
            back = back.next;
        }
    }

    public int dequeue() {
        int dequeueVal = 0;
        if(front != null){
            dequeueVal = front.valueData;
            front = front.next;
        }
        return dequeueVal;
    }

    public int peek() {
        if(front == null){
            return Integer.parseInt(null);
        }
        return front.valueData;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display(){
        System.out.println(front.toString());
    }
}