package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.*;
import tree.Node;


public class BinarySearchTree {

    public Node root;

    public LinkedList<Integer> inOrder(Node<Integer> t) {

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
        for (int i = 0; i < list.size(); i++) {
            // Why does this have to be += and not +?
            treeString += " " + list.get(i);
        }
        return treeString;
    }

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

