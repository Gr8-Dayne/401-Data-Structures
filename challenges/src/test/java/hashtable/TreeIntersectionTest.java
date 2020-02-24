package hashtable;


import org.junit.Before;
import org.junit.Test;
import tree.*;
import static hashtable.TreeIntersection.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TreeIntersectionTest {

    BinarySearchTree treeOne = new BinarySearchTree();
    BinarySearchTree treeTwo = new BinarySearchTree();

    HashMap endResult = new HashMap();

    @Before
    public void plantingTrees() {

        // 9, 3, 1, 2, 5, 8, 15
        treeOne.root = new Node<>(2);
        treeOne.root.left = new Node<>(3);
        treeOne.root.left.left = new Node<>(9);
        treeOne.root.left.right = new Node<>(1);
        treeOne.root.right = new Node<>(8);
        treeOne.root.right.left = new Node<>(5);
        treeOne.root.right.right = new Node<>(15);

        // 10, 9, 24, 7, 18, 6, 15
        treeTwo.root = new Node<>(7);
        treeTwo.root.left = new Node<>(9);
        treeTwo.root.left.left = new Node<>(10);
        treeTwo.root.left.right = new Node<>(24);
        treeTwo.root.right = new Node<>(6);
        treeTwo.root.right.left = new Node<>(18);
        treeTwo.root.right.right = new Node<>(15);
    }

    @Test
    public void treeIntersectionTest() {
        endResult = treeIntersection(treeOne, treeTwo);
        System.out.println("-----End Result-----");
        System.out.println(endResult);
        System.out.println();

        // 9, 15
        assertTrue(endResult.contains("9"));
        assertTrue(endResult.contains("15"));

        // 3, 1, 2, 5, 8
        assertFalse(endResult.contains("3"));
        assertFalse(endResult.contains("1"));
        assertFalse(endResult.contains("2"));
        assertFalse(endResult.contains("5"));
        assertFalse(endResult.contains("8"));

        // 10, 24, 7, 18, 6
        assertFalse(endResult.contains("10"));
        assertFalse(endResult.contains("24"));
        assertFalse(endResult.contains("7"));
        assertFalse(endResult.contains("18"));
        assertFalse(endResult.contains("6"));
    }
}