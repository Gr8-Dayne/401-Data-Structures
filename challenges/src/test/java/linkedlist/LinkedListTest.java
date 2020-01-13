package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test public void insertHeadTest() {

        LinkedList list = new LinkedList();
        list.insertHead(10);
        assertEquals(10, list.head.valueData);

    }

    @Test public void verifyHead() {

        LinkedList list = new LinkedList();
        list.insertHead(20);
        list.insertHead(10);
        list.insertHead(50);
        assertEquals(50, list.head.valueData);

    }

//    Will return true when finding a value within the linked list that exists
//    Will return false when searching for a value in the linked list that does not exist
    @Test public void booleanValueSearch() {

        LinkedList list = new LinkedList();
        list.insertHead(20);
        list.insertHead(10);
        list.insertHead(50);
        assertEquals(50, list.head.valueData);

    }

//    Can properly insert multiple nodes into the linked list
//    Can properly return a collection of all the values that exist in the linked list
    @Test public String toString() {

        LinkedList list = new LinkedList();
        list.insertHead(20);
        list.insertHead(10);
        list.insertHead(50);

        expectedAnswer = "{ 20 } => { 10 } => { 50 } => null";

        return overallStatement + null;
    }

}


