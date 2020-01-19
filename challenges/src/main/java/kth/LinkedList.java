package kth;


public class LinkedList {


    Node head;
    static int nodes;

    static class Node {
        int valueData;
        Node next;

        Node(int valueData) {
            this.valueData = valueData;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head = null;
        nodes = 0;
    }

    public int getListSize() {
        return nodes;
    }

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

    // Credit for this concept: https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/
    public static Node cccc_combination(LinkedList list1, LinkedList list2) {

        Node Katlyn1 = list1.head;
        Node Katlyn2 = list2.head;
        Node nodethaniel = new Node(0);
        Node tail = nodethaniel;

        while (true) {
            if (Katlyn1 == null) {
                tail.next = Katlyn2;
                break;
            }
            if (Katlyn2 == null) {
                tail.next = Katlyn1;
                break;
            }
            // Arrow function in Java?
            if (Katlyn1.valueData <= Katlyn2.valueData) {
                tail.next = Katlyn1;
                Katlyn1 = Katlyn1.next;
            } else {
                tail.next = Katlyn2;
                Katlyn2 = Katlyn2.next;
            }
            tail = tail.next;
        }
        return nodethaniel.next;
    }
}


