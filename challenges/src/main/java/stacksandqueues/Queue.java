package stacksandqueues;


import java.util.NoSuchElementException;


public class Queue<E> {

    Node <E> front;
    Node <E> back;

    // Got this Method from Phong
    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(E val) {

        Node <E> node = new Node(val, null);
        Node <E> currentNode = this.back;

        if(this.front == null){
            this.front = node;
            this.back = node;
        } else {
            currentNode.next = node;
            this.back = node;
        }

        // OG code
//        if (front == null){
//            front = new Node<E>(numberVal, null);
//            back = front;
//        } else {
//            back.next = new Node<E>(numberVal, null);
//            back = back.next;
//        }
    }

    public E dequeue() {

        if(this.isEmpty()){
            System.out.println("The Queue is empty");
            throw new NoSuchElementException();
        }
        E loneValue = this.front.valueData;
        this.front = this.front.next;
        if(this.front == null){
            this.back = null;
        }
        return loneValue;

        // OG code
//        E dequeueVal = this.front.valueData;
//        this.front = this.front.next;
//        if(this.front == null){
//            this.back = null;
//        }
//        return dequeueVal;
    }

    public String peek(){
        if(this.isEmpty()){
            return null;
        }
        E frontVal = this.front.valueData;
        return frontVal.toString();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display(){
        System.out.println(front.toString());
    }
}