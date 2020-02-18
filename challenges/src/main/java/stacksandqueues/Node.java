package stacksandqueues;


public class Node<E> {

    public E valueData;
    public Node<E> next;

    Node(E valueData, Node<E> next) {
        this.valueData = valueData;
        this.next = next;
    }

    @Override public String toString() {
        return "Node{" + "valueData=" + valueData + ", next=" + next + '}';
    }

}
