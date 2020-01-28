package tree;

public class Node {

    Node left;
    Node right;
    Integer nodeValue;

    // Crystal helped me figure out the below configuration
    Node(int nodeValue) {
        this.nodeValue = nodeValue;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nodeValue=" + nodeValue +
                '}';
    }
}