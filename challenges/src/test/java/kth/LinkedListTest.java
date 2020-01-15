package kth;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LinkedListTest {


    LinkedList theKFactor;

    @Before public void typeListValuesOnce() {

        theKFactor = new LinkedList();

        theKFactor.insertIntoList(55);
        theKFactor.insertIntoList(80);
        theKFactor.insertIntoList(64);
        theKFactor.insertIntoList(7000);
        theKFactor.insertIntoList(69);
        theKFactor.insertIntoList(120);
        theKFactor.insertIntoList(77);
    }


    // Where k and the length of the list are the same
    @Test public void linkedList_testInsertForSize() {
        int expected = 7;
        int actual = theKFactor.getListSize();
        assertEquals(expected, actual);
    }


    // Where k is not a positive integer
    @Test(expected = IndexOutOfBoundsException.class) public void ExceptionTest() {
        int actual = theKFactor.findTheValueData(14);
    }


    // Where the linked list's length is 1
    @Test public void listOfOneTest() {
        LinkedList singleIntList = new LinkedList();
        singleIntList.insertIntoList(9000);
        int expected = 9000;
        int actual = singleIntList.findTheValueData(0);
        assertEquals(expected, actual);
    }


    // “Happy Path” where k is not at the end, but somewhere in the middle of the linked list
    @Test public void theKFactor_Start() {
        int expected = 77;
        int actual = theKFactor.findTheValueData(6);
        assertEquals(expected, actual);
    }

    @Test public void theKFactor_Middle() {
        int expected = 64;
        int actual = theKFactor.findTheValueData(2);
        assertEquals(expected, actual);
    }

    @Test public void theKFactor_End() {
        int expected = 55;
        int actual = theKFactor.findTheValueData(0);
        assertEquals(expected, actual);
    }
}


