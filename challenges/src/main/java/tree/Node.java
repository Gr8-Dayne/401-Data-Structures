package tree;


public class Node<E> {

    public Node<E> left;
    public Node<E> right;
    public E nodeValue;

    public Node(E nodeValue) {
        this.nodeValue = nodeValue;
        left = null;
        right = null;
    }

    public Node() {}

    @Override
    public String toString() {
        return "" + nodeValue + "";
    }
}