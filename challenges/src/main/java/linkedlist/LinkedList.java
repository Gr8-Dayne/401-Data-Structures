
package linkedlist;

public class LinkedList {

    // makes Node head stuff 'global' within public class
    Node head;

    // Node class
    class Node {

        int valueData;
        Node next;


        Node(int valueData, Node next) {

            this.valueData = valueData;
            this.next = next;

        }

    }

    public void insertHead(int HeadValue){

        // New Head instantiation
        Node HeadNode = new Node(HeadValue, null);

        // Retain old list data
        Node OldHead = this.head;

        // Create new head
        this.head = HeadNode;

        // Assign new head's "next" to old list data
        this.head.next = OldHead;

    }

    public boolean includedInList(int searchedValue){

        // Creating current instance
        Node current = this.head;

        while (current != null){

            if (searchedValue == current.valueData){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString(){

        Node current = this.head;

        while (current != null){

            current = current.next;

        }

    }

    return "{ a } -> { b } -> { c } -> NULL";

}




//    Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
//
//    Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
//
//    Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
//
//    Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
//
//    Define a method called toString which takes in no arguments and returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"


