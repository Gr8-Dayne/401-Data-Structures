package stacksandqueues;


public class Node {

    int valueData;
    Node next;

    Node(int valueData, Node next) {
        this.valueData = valueData;
        this.next = next;
    }

    @Override public String toString() {
        return "Node{" + "valueData=" + valueData + ", next=" + next + '}';
    }

}
