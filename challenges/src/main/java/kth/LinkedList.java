package kth;


public class LinkedList {


    Node head;
    static int nodes;


    // Node class instantiate
    static class Node {
        int valueData;
        Node next;

        Node(int valueData) {
            this.valueData = valueData;
            this.next = next;
        }
    }


    // Baseline for LinkedLists
    public LinkedList() {
        this.head = null;
        nodes = 0;
    }


    // Method to get current list count
    public int getListSize() {
        return nodes;
    }


    // Node insertion (and count) method
    public void insertIntoList(int headValue) {
        if (this.head == null) {
            this.head = new Node(headValue);
        } else {
            Node newNode = new Node(headValue);
            newNode.next = this.head;
            this.head = newNode;
        }
        nodes++;
    }


    // Feature Method: Also throws exception/Will return feature data
    public int findTheValueData(int kilo) {
        int kIndex = this.getListSize() - kilo - 1;
        if (kIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        while (kIndex > 0) {
            currentNode = currentNode.next;
            kIndex--;
        }
        return currentNode.valueData;
    }


    // toString method
    public String toString(){
        Node current = this.head;
        String overallStatement = "";
        while (current != null){
            String stringStatement = "{ " + current.valueData + " } => ";
            overallStatement = overallStatement + stringStatement;
            current = current.next;
        }
        return overallStatement + "null";
    }
}


