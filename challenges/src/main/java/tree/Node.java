package tree;


public class Node<E> {

    public Node<E> root, left, right;
    public E nodeValue;

    public Node(E nodeValue) {
        this.nodeValue = nodeValue;
        root = null;
        left = null;
        right = null;
    }

    public Node() {}

    @Override
    public String toString() {
        return "" + nodeValue + "";
    }
}