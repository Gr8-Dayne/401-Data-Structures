package stacksandqueues;


import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;


public class StackTest {

    Stack stackForTesting;

    @Test public void pushToStackTest() {
        stackForTesting = new Stack();
        stackForTesting.push(1);
        stackForTesting.push(2);
        stackForTesting.push(3);
        int actual = stackForTesting.peek();
        assertEquals(3, actual);
    }

    @Test public void popFromStackTest() {
        stackForTesting = new Stack();
        stackForTesting.push(1);
        stackForTesting.push(2);
        stackForTesting.push(3);
        int actual = stackForTesting.peek();
        assertEquals(actual, stackForTesting.pop());
    }

    @Test public void popMultipleFromStackTest() {
        stackForTesting = new Stack();
        stackForTesting.push(1);
        stackForTesting.push(2);
        stackForTesting.push(3);
        stackForTesting.pop();
        stackForTesting.pop();
        stackForTesting.pop();
        assertEquals(stackForTesting.isEmpty(), true);
    }

    @Test public void peekTopStackTest() {
        stackForTesting = new Stack();
        stackForTesting.push(1);
        stackForTesting.push(2);
        stackForTesting.push(3);
        int expected = stackForTesting.peek();
        int actual = stackForTesting.top.valueData;
        assertEquals(expected, actual);
    }

    @Test public void isEmptyStackTest() {
        stackForTesting = new Stack();
        assertEquals(stackForTesting.isEmpty(), true);
    }
}