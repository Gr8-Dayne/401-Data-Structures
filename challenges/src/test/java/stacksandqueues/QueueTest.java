package stacksandqueues;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {

    Queue queueForTesting = new Queue();

    @Before
    public void preGameQueue() {
        queueForTesting.enqueue(1);
        queueForTesting.enqueue(2);
        queueForTesting.enqueue(3);
    }

    @Test
    public void enqueueQueueTest() {
        queueForTesting.display();
        Integer expected = 1;
        assertEquals(expected, queueForTesting.front.valueData);
    }

    @Test
    public void dequeueQueueTest() {
        Integer expected = 1;
        assertEquals(expected, queueForTesting.dequeue());
    }

    @Test
    public void popMultipleFromStackTest() {
//        queueForTesting.display();
        queueForTesting.dequeue();
//        queueForTesting.display();
        queueForTesting.dequeue();

        Integer expected = 3;
        assertEquals(expected, queueForTesting.front.valueData);
    }

    @Test
    public void peekQueueTest() {
        assertEquals(queueForTesting.peek(), queueForTesting.front.valueData.toString());
    }

    @Test
    public void isEmptyQueueTest() {
        queueForTesting = new Queue();
        assertTrue(queueForTesting.isEmpty());
    }
}