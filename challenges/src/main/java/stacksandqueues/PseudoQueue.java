package stacksandqueues;


// Credit: https://coderbyte.com/algorithm/implement-queue-using-two-stacks


public class PseudoQueue {

    // Stack one
    public Stack forEnqueue;
    // Stack two
    public Stack forDequeue;

    public PseudoQueue(){
        forEnqueue = new Stack();
        forDequeue = new Stack();
    }

    // Enqueue
    public void enqueue(int value){

        while(!forDequeue.isEmpty()) {

            forEnqueue.push(forDequeue.pop());

        }
        forEnqueue.push(value);
    }

    // Dequeue
    public int dequeue(){

        while(!forDequeue.isEmpty()){

            forDequeue.push(forEnqueue.pop());

        }
        return forDequeue.pop();
    }
}


