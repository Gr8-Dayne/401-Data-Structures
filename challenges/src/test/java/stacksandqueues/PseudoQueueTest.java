package stacksandqueues;


import org.junit.Test;
import static org.junit.Assert.*;


public class PseudoQueueTest {

    // Input Stack
    PseudoQueue pseudoQueueA;
    // Output Stack
    PseudoQueue pseudoQueueB;

    // Enqueue Test
    @Test public void pseudoQueueEnqueueTest() {
        pseudoQueueA = new PseudoQueue();
        pseudoQueueB = new PseudoQueue();
        pseudoQueueA.pseudoQueueEnqueue(1);
        pseudoQueueA.pseudoQueueEnqueue(2);
        pseudoQueueA.pseudoQueueEnqueue(3);
        pseudoQueueB.pseudoQueueEnqueue(7);
        pseudoQueueA.display();
        pseudoQueueB.display();
        int actualA = pseudoQueueA.front.valueData;
        int actualB = pseudoQueueB.front.valueData;
        assertEquals(1, actualA);
        assertEquals(7, actualB);
    }

    // Dequeue Test
    @Test public void pseudoQueueDequeueTest() {
        pseudoQueueA = new PseudoQueue();
        pseudoQueueB = new PseudoQueue();
        pseudoQueueA.pseudoQueueEnqueue(1);
        pseudoQueueA.pseudoQueueEnqueue(2);
        pseudoQueueA.pseudoQueueEnqueue(3);
        pseudoQueueA.display();
        pseudoQueueB.display();
        int actual = pseudoQueueA.pseudoQueueDequeue();
        pseudoQueueA.display();
        pseudoQueueB.display();
        assertEquals(1, actual);
    }
}