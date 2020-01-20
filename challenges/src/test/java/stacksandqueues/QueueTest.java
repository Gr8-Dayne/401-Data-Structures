package stacksandqueues;


import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {

    Queue queueForTesting;

    @Test public void enqueueQueueTest() {
        queueForTesting = new Queue();
        queueForTesting.enqueue(1);
        queueForTesting.enqueue(2);
        queueForTesting.enqueue(3);
        queueForTesting.display();
        int actual = queueForTesting.front.valueData;
        assertEquals(1, actual);
    }

    @Test public void dequeueQueueTest() {
        queueForTesting = new Queue();
        queueForTesting.enqueue(1);
        queueForTesting.enqueue(2);
        queueForTesting.enqueue(3);
        int actual = queueForTesting.dequeue();
        assertEquals(1, actual);
    }

    @Test public void popMultipleFromStackTest() {
        queueForTesting = new Queue();
        queueForTesting.enqueue(1);
        queueForTesting.enqueue(2);
        queueForTesting.enqueue(3);
//        queueForTesting.display();
        queueForTesting.dequeue();
//        queueForTesting.display();
        queueForTesting.dequeue();
        int actual = queueForTesting.front.valueData;
        assertEquals(3, actual);
    }

    @Test public void peekQueueTest() {
        queueForTesting = new Queue();
        queueForTesting.enqueue(1);
        queueForTesting.enqueue(2);
        queueForTesting.enqueue(3);

        int expected = queueForTesting.peek();
        int actual = queueForTesting.front.valueData;

        assertEquals(expected, actual);

    }

    @Test public void isEmptyQueueTest() {
        queueForTesting = new Queue();
        assertEquals(queueForTesting.isEmpty(), true);
    }
}