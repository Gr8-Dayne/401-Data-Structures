package kth.linkedlist;


import org.junit.Test;
import static org.junit.Assert.*;


public class LinkedListTest {

    @Test public void emptyListTest() {
        BasicLinkedList list = new BasicLinkedList();
        assertNull(list.head);
    }

    @Test public void insertHeadTest() {

        BasicLinkedList list = new BasicLinkedList();
        list.insertNode(10);
        assertEquals(10, list.head.valueData);

    }

    @Test public void verifyHead() {

        BasicLinkedList list = new BasicLinkedList();
        list.insertNode(20);
        list.insertNode(10);
        list.insertNode(50);
        assertEquals(50, list.head.valueData);

    }

//    Will return true when finding a value within the linked list that exists
//    Will return false when searching for a value in the linked list that does not exist
    @Test public void booleanValueSearch() {

        BasicLinkedList list = new BasicLinkedList();
        list.insertNode(20);
        list.insertNode(10);
        list.insertNode(50);

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

        BasicLinkedList list = new BasicLinkedList();
        list.insertNode(20);
        list.insertNode(10);
        list.insertNode(50);

        String expectedAnswer = "{ 50 } => { 10 } => { 20 } => null";

        assertEquals("Contains nodes 50, 10, 20",
                expectedAnswer,
                list.toString());

    }

    // Append a Node to the end of the Linked List
    @Test public void appendTest() {

        BasicLinkedList appendList = new BasicLinkedList();

        appendList.insertNode(3);
        appendList.insertNode(2);
        appendList.insertNode(1);

        appendList.append(66);

        String expected = "{ 1 } => { 2 } => { 3 } => { 66 } => null";

        assertEquals(expected, (appendList.toString()));

    }

    // Insert Node directly after specified target
    @Test public void insertAfterTest() {

        BasicLinkedList afterList = new BasicLinkedList();

        afterList.insertNode(5);
        afterList.insertNode(4);
        afterList.insertNode(3);
        afterList.insertNode(2);
        afterList.insertNode(1);

        afterList.insertAfter(3, 700);

        String expected = "{ 1 } => { 2 } => { 3 } => { 700 } => { 4 } => { 5 } => null";

        assertEquals(expected, (afterList.toString()));

    }

    // Insert Node directly after specified target (the last Node in the Linked List)
    @Test public void insertAfterTestTheSequel() {

        BasicLinkedList afterListAgain = new BasicLinkedList();

        afterListAgain.insertNode(1);
        afterListAgain.insertNode(2);
        afterListAgain.insertNode(3);
        afterListAgain.insertNode(4);
        afterListAgain.insertNode(5);

        afterListAgain.insertAfter(1, 700);

        String expected = "{ 5 } => { 4 } => { 3 } => { 2 } => { 1 } => { 700 } => null";

        assertEquals(expected, (afterListAgain.toString()));

    }

    // Insert Node directly before specified target
    @Test public void insertBeforeTest() {

        BasicLinkedList beforeList = new BasicLinkedList();

        beforeList.insertNode(10);
        beforeList.insertNode(20);
        beforeList.insertNode(30);
        beforeList.insertNode(40);
        beforeList.insertNode(50);

        beforeList.insertBefore(30, 7000);

        String expected = "{ 50 } => { 40 } => { 7000 } => { 30 } => { 20 } => { 10 } => null";

        assertEquals(expected, (beforeList.toString()));

    }

    // Insert Node directly before specified target (the first Node in the Linked List
    @Test public void insertBeforeTestTheSequel() {

        BasicLinkedList listBeforeTime = new BasicLinkedList();

        listBeforeTime.insertNode(50);
        listBeforeTime.insertNode(40);
        listBeforeTime.insertNode(30);
        listBeforeTime.insertNode(20);
        listBeforeTime.insertNode(10);

        listBeforeTime.insertBefore(10, 7000);

        String expected = "{ 7000 } => { 10 } => { 20 } => { 30 } => { 40 } => { 50 } => null";

        assertEquals(expected, (listBeforeTime.toString()));

    }

}


