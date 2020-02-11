package utilities;


import org.junit.Test;
import tree.Node;
import tree.Tree;
import static org.junit.Assert.*;
import static utilities.FizzBuzzTree.fizzBuzzTree;


public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTest(){

        Tree<Integer> targetTree = new Tree<>();

        targetTree.root = new Node<>(1);
        targetTree.root.left = new Node<>(5);
        targetTree.root.right = new Node<>(2);
        targetTree.root.left.left = new Node<>(10);
        targetTree.root.left.right = new Node<>(15);
        targetTree.root.right.left = new Node<>(4);
        targetTree.root.right.right = new Node<>(6);

        assertEquals(1, (int) targetTree.root.nodeValue);
        assertEquals(5, (int) targetTree.root.left.nodeValue);
        assertEquals(2, (int) targetTree.root.right.nodeValue);
        assertEquals(10, (int) targetTree.root.left.left.nodeValue);
        assertEquals(15, (int) targetTree.root.left.right.nodeValue);
        assertEquals(4, (int) targetTree.root.right.left.nodeValue);
        assertEquals(6, (int) targetTree.root.right.right.nodeValue);

        Tree<String> answerTree = fizzBuzzTree(targetTree);

        assertEquals("1", answerTree.root.nodeValue);
        assertEquals("Buzz", answerTree.root.left.nodeValue);
        assertEquals("2", answerTree.root.right.nodeValue);
        assertEquals("Buzz", answerTree.root.left.left.nodeValue);
        assertEquals("FizzBuzz", answerTree.root.left.right.nodeValue);
        assertEquals("4", answerTree.root.right.left.nodeValue);
        assertEquals("Fizz", answerTree.root.right.right.nodeValue);
    }
}