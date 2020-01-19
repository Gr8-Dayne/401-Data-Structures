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

    // toString test
    @Test public void testToString() {
        LinkedList theStringining = new LinkedList();
        theStringining.insertIntoList(0);
        theStringining.insertIntoList(1);
        theStringining.insertIntoList(0);
        String expected = "{ 0 } => { 1 } => { 0 } => null";
        String actual = theStringining.toString();
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

    @Test public void testMerge(){

        LinkedList list1 = new LinkedList();
        list1.insertIntoList(7);
        list1.insertIntoList(5);
        list1.insertIntoList(3);
        list1.insertIntoList(1);

        LinkedList list2 = new LinkedList();
        list2.insertIntoList(6);
        list2.insertIntoList(4);
        list2.insertIntoList(2);

        LinkedList.cccc_combination(list1, list2);

        String expected = "{ 1 } => { 2 } => { 3 } => { 4 } => { 5 } => { 6 } => { 7 } => null";
        String actual = list1.toString();
        assertEquals(expected, actual);
    }
}


