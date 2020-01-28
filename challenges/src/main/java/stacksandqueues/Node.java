package stacksandqueues;


public class Node {

    public int valueData;
    public Node next;

    Node(int valueData, Node next) {
        this.valueData = valueData;
        this.next = next;
    }

    @Override public String toString() {
        return "Node{" + "valueData=" + valueData + ", next=" + next + '}';
    }

}
