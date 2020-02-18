package tree;


import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.*;


public class BinarySearchTreeTest {

    Node<Integer> root;
    BinarySearchTree pineTree = new BinarySearchTree();
    LinkedList birchList;
    Tree<Integer> breadthList;

    // Can successfully instantiate an empty tree
    @Test public void instantiateEmptyTest() {
        birchList = pineTree.inOrder(root);
//        System.out.println("birchList: " + birchList.toString());
        String expected = "[]";
        String actual = birchList.toString();
        assertEquals(expected, actual);
    }

    // Can successfully instantiate a tree with a single root node
    @Test public void addToEmptyTest() {

        pineTree.add(7);
        birchList = pineTree.inOrder(pineTree.root);
        Object actual = pineTree.sendNodes(birchList);
//        System.out.println("actual = " + actual);
        assertEquals(" 7", actual);
    }

    // Can successfully add a left child and right child to a single root node
    @Test public void addLeftTest() {

        pineTree.add(10);
        pineTree.add(5);
        pineTree.add(20);

        String rootVal = pineTree.root.nodeValue.toString();
        String leftVal = pineTree.root.left.nodeValue.toString();
        String rightVal = pineTree.root.right.nodeValue.toString();

        String actual ="{" + leftVal + " " + rootVal + " " + rightVal + "}";
        String expected = "{5 10 20}";
        assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        pineTree.add(14);
        pineTree.add(12);
        pineTree.add(17);
        pineTree.add(15);
        pineTree.add(13);
//        System.out.println(pineTree.root.nodeValue.toString());
        assertTrue(pineTree.contains(pineTree.root, 17));
        assertFalse(pineTree.contains(pineTree.root, 10));
    }
}