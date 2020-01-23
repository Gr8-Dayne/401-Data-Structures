package stacksandqueues;


// Credit: https://coderbyte.com/algorithm/implement-queue-using-two-stacks


public class PseudoQueue {

    // Stack One
    public Stack forEnqueue;
    // Stack Two
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
        while(!forEnqueue.isEmpty()){
            forDequeue.push(forEnqueue.pop());
        }
        return forDequeue.pop();
    }
}


