package tree;


import java.util.LinkedList;


public class BinarySearchTree {

    // What benefit would having public here provide?
    public Node root;

    // returns an array of the values, ordered appropriately.
    public LinkedList<Integer> inOrder(Node<Integer> t){

        LinkedList<Integer> answer = new LinkedList<Integer>();

        if (t != null) {
            LinkedList<Integer> left = inOrder(t.left);
            answer.addAll(left);
            answer.add(t.nodeValue);
            LinkedList<Integer> right = inOrder(t.right);
            answer.addAll(right);
        }
        return answer;
    }

    // accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    // Credit: https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/
    // Credit: https://www.baeldung.com/java-binary-tree

    @Override
    public String toString() {
        return "{" + "root=" + root.nodeValue + '}';
    }

    public void add(int value) {
        root = addNodethy(root, value);
    }

    private Node addNodethy(Node<Integer> current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.nodeValue) {
            current.left = addNodethy(current.left, value);
        } else if (value > current.nodeValue) {
            current.right = addNodethy(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    // Credit: https://stackoverflow.com/questions/10168066/how-to-print-out-all-the-elements-of-a-list-in-java
    public Object sendNodes(LinkedList<Integer> list) {
        String treeString = "";
        for (int i=0; i<list.size(); i++) {
            // Why does this have to be += and not +?
            treeString += " " + list.get(i);
        }
        return treeString;
    }

    // accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
    // Credit: https://people.cs.umass.edu/~barring/cs187f12/disc/BinarySearchTree.java
    public boolean contains(Node<Integer> root, Integer target) {
            if (root == null) {
                return false;
            }
            if (root.nodeValue == target) {
                return true;
            }
            if (root.nodeValue > target) {
                return contains(root.left, target);
            }
        return contains(root.right, target);
    }
}

