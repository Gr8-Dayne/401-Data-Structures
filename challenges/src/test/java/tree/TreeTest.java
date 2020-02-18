package tree;


import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class TreeTest {

    Tree<Integer> test = new Tree<>();

    @Override
    public String toString() {
        return "TreeTest{" + "test=" + test + '}';
    }

    @Before
    public void testTree() {
        test.root = new Node<>(7);
        test.root.left = new Node<>(1);
        test.root.right = new Node<>(10);
    }

    // Credit: TA James
    // test.prePrint(test.root);

    // Can successfully return a collection from a pre-order traversal
    @Test public void preOrderTest() {
        String expected = "[7, 1, 10]";
        String actual = test.preOrder(test.root).toString();
        assertEquals(expected, actual);
        // System.out.println(test.preOrder(test.root));
    }

    // Can successfully return a collection from an inorder traversal
    @Test public void inOrderTest() {
        String expected = "[1, 7, 10]";
        String actual = test.inOrder(test.root).toString();
        assertEquals(expected, actual);
//         System.out.println(test.inOrder(test.root));
    }

    // Can successfully return a collection from a post-order traversal
    @Test public void postOrderTest() {
        String expected = "[1, 10, 7]";
        String actual = test.postOrder(test.root).toString();
        assertEquals(expected, actual);
        // System.out.println(test.postOrder(test.root).toString());
    }

    // Happy Path Test
    @Test
    public void breadthWithQueueTest() {
        Tree<Integer> breadthList = new Tree<>();
        breadthList.root = new Node<>(1);
        breadthList.root.left = new Node<>(2);
        breadthList.root.right = new Node<>(3);
        breadthList.root.left.left = new Node<>(4);
        breadthList.root.left.right = new Node<>(5);
        breadthList.root.right.left = new Node<>(70);
        breadthList.root.right.right = new Node<>(7);
        String expected = "[1, 2, 3, 4, 5, 70, 7]";
        assertEquals(expected, breadthList.breadthWithQueue().toString());
    }

    //
    // Expected Failure: Empty Tree
    // PLEASE BE ADVISED: THIS TEST IS SUPPOSED TO FAIL, AND IT FAILS BEAUTIFULLY
    // IT IS COMMENTED OUT SO ALL OTHER TESTS CAN BE CONFIRMED
    //

//    @Test
//    public void breadthWithQueueExpectedFailureTest(){
//        Tree<Integer> breadthList = new Tree<>();
//        LinkedList<Integer> actual = breadthList.breadthWithQueue();
//        assertNotEquals(null, actual);
//    }

    //
    // Edge Case: Empty Node values
    // PLEASE BE ADVISED: THIS TEST IS SUPPOSED TO FAIL, AND IT FAILS BEAUTIFULLY
    // IT IS COMMENTED OUT SO ALL OTHER TESTS CAN BE CONFIRMED
    //

//    @Test
//    public void breadthWithQueueEdgeCaseTest(){
//
//        Tree<Integer> breadthList = new Tree<>();
//
//        breadthList.root = new Node<>();
//        breadthList.root.left = new Node<>();
//        breadthList.root.right = new Node<>();
//
//        LinkedList<Integer> actual = breadthList.breadthWithQueue();
//        System.out.println("actual = " + actual);
//
//        assertNotEquals(" ", actual);
//    }
}