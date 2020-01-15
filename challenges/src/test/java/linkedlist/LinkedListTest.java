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

        // call fuction you already wrote (dont make a new one stupid)
        list.includedInList(10);

        System.out.println(list.includedInList(11));

        assertFalse("Does not have 11.",
                list.includedInList(11));

        assertTrue("Does have 10.",
                list.includedInList(10));

//    if(expected != actual){
//        throw Exception();
//        return message;
//    } else {
//        happy :)
//    }


    }

//    Can properly insert multiple nodes into the linked list
//    Can properly return a collection of all the values that exist in the linked list
    @Test public void toStringTest() {

        LinkedList list = new LinkedList();
        list.insertHead(20);
        list.insertHead(10);
        list.insertHead(50);

        String expectedAnswer = "{ 50 } => { 10 } => { 20 } => null";

        assertEquals("Contains nodes 50, 10, 20",
                expectedAnswer,
                list.toString());

    }

    @Test public void addToEndTest() {

    }

    @Test public void instantiateBeforeTest() {

    }

    @Test public void instantiateAfterTest() {

    }

}


