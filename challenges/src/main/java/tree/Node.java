package tree;


public class Node<E> {

    public Node<E> left;
    public Node<E> right;
    public E nodeValue;

    // Crystal helped me figure out the below configuration
    public Node(E nodeValue) {
        this.nodeValue = nodeValue;
        left = null;
        right = null;
    }

    public Node() {}

    @Override
    public String toString() {
        return "Node{" + "nodeValue=" + nodeValue + '}';
    }
}