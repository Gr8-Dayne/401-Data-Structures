package stacksandqueues;


public class PseudoQueue {

    Node front;
    Node back;

    public void push(int numberVal) {
        front = new Node(numberVal, front);
    }

    public void pseudoQueueEnqueue(int pseudoVal) {
        if (front == null){
        front = new Node(pseudoVal, null);
        back = front;
        back.next = null;
        } else {
            back.next = new Node(pseudoVal, null);
            back = back.next;
        }
    }

//    public void enqueue(int numberVal) {
//        if (front == null){
//            front = new Node(numberVal, null);
//            back = front;
//        } else {
//            back.next = new Node(numberVal, null);
//            back = back.next;
//        }
//    }

    public int pop() {
        int popVal = front.valueData;
        front = front.next;
        return popVal;
    }

    public int pseudoQueueDequeue() {

        int popVal = front.valueData;
        front = front.next;
        return popVal;

//        int dequeueVal = 0;
//        if(front != null){
//            dequeueVal = front.valueData;
//            front = front.next;
//        }
//        return dequeueVal;
    }

//    public int dequeue() {
//        int dequeueVal = 0;
//        if(front != null){
//            dequeueVal = front.valueData;
//            front = front.next;
//        }
//        return dequeueVal;
//    }

    public void display(){
        System.out.println(front.toString());
    }
}
