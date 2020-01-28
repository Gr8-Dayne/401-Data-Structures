package tree;


public class Node {

    Node left;
    Node right;
    Integer nodeValue;

    // Crystal helped me figure out the below configuration
    Node(Integer nodeValue) {
        this.nodeValue = nodeValue;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "Node{" + "nodeValue=" + nodeValue + '}';
    }
}