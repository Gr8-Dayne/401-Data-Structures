package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    // Can successfully return a collection from a pre-order traversal
    @Test public void preOrderTest() {

        //        test.prePrint(test.root);

        Tree test = new Tree();
        test.root = new Node(7);
        test.root.left = new Node(1);
        test.root.right = new Node(10);

        System.out.println(test.preOrder(test.root));

    }

    // Can successfully return a collection from an inorder traversal
    @Test public void inOrderTest() {

        Tree test = new Tree();
        test.root = new Node(7);
        test.root.left = new Node(1);
        test.root.right = new Node(10);

        System.out.println(test.inOrder(test.root));

    }

    // Can successfully return a collection from a post-order traversal
    @Test public void postOrderTest() {

        Tree test = new Tree();
        test.root = new Node(7);
        test.root.left = new Node(1);
        test.root.right = new Node(10);


        System.out.println(test.postOrder(test.root));

    }
}