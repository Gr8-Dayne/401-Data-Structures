package stacksandqueues;


import org.junit.Test;
import static org.junit.Assert.*;


public class PseudoQueueTest {

    PseudoQueue pseudoForTesting;

    @Test public void pseudoQueueEnqueueTest() {
        pseudoForTesting = new PseudoQueue();
        pseudoForTesting.pseudoQueueEnqueue(1);
        pseudoForTesting.display();
        pseudoForTesting.pseudoQueueEnqueue(2);
        pseudoForTesting.display();
        pseudoForTesting.pseudoQueueEnqueue(3);
        pseudoForTesting.display();
        int actual = pseudoForTesting.front.valueData;
        assertEquals(1, actual);
    }

    @Test public void pseudoQueueDequeueTest() {
        pseudoForTesting = new PseudoQueue();
        pseudoForTesting.pseudoQueueEnqueue(1);
        pseudoForTesting.pseudoQueueEnqueue(2);
        pseudoForTesting.pseudoQueueEnqueue(3);
        pseudoForTesting.display();
        int actual = pseudoForTesting.pseudoQueueDequeue();
        pseudoForTesting.display();
        assertEquals(1, actual);
    }
}