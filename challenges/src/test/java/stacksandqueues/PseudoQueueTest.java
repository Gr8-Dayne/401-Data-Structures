package stacksandqueues;


import org.junit.Test;
import static org.junit.Assert.*;


public class PseudoQueueTest {

    // Input Stack
    PseudoQueue forEnqueue;
    // Output Stack
    PseudoQueue forDequeue;

    // Test forEnqueue getting values/nodes
    @Test public void pseudoQueueEnqueueTest() {
        forEnqueue = new PseudoQueue();
        forDequeue = new PseudoQueue();
        forEnqueue.enqueue(1);
        forEnqueue.enqueue(2);
        forEnqueue.enqueue(3);
        forEnqueue.enqueue(7);
        // System.out.println(forEnqueue.forEnqueue.peek());
        assertEquals(7, forEnqueue.forEnqueue.peek());
    }

    // Dequeue Test
    @Test public void pseudoQueueDequeueTest() {
        forEnqueue = new PseudoQueue();
        forDequeue = new PseudoQueue();
        forEnqueue.enqueue(1);
        forEnqueue.enqueue(2);
        forEnqueue.enqueue(3);
        System.out.println(forEnqueue.forEnqueue.top);
        int actual = forEnqueue.dequeue();
        assertEquals(1, actual);
    }
}