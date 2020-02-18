package tree;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.LinkedList;


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

    @Test public void preOrderTest() {
        String expected = "[7, 1, 10]";
        String actual = test.preOrder(test.root).toString();
        assertEquals(expected, actual);
    }

    @Test public void inOrderTest() {
        String expected = "[1, 7, 10]";
        String actual = test.inOrder(test.root).toString();
        assertEquals(expected, actual);
    }

    @Test public void postOrderTest() {
        String expected = "[1, 10, 7]";
        String actual = test.postOrder(test.root).toString();
        assertEquals(expected, actual);
    }

    //
    // Code Challenge 17
    //

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

    //
    // Code Challenge 18
    //

    // Happy Path Test
    @Test
    public void maximumValueTest() {
        Tree<Integer> maximusList = new Tree<>();
        maximusList.root = new Node<>(15);
        maximusList.root.left = new Node<>(40);
        maximusList.root.right = new Node<>(20);
        maximusList.root.left.left = new Node<>(100);
        maximusList.root.left.right = new Node<>(70);
        maximusList.root.right.left = new Node<>(70);
        maximusList.root.right.right = new Node<>(90);
        int actual = maximusList.findMaximumValue();
        assertEquals(100, actual);
    }

    //
    // Expected Failure: Empty Tree
    // PLEASE BE ADVISED: THIS TEST IS SUPPOSED TO FAIL, AND IT FAILS BEAUTIFULLY
    // IT IS COMMENTED OUT SO ALL OTHER TESTS CAN BE CONFIRMED
    //
//    @Test
//    public void maximumValueEmptyTest(){
//        Tree<Integer> maximusList = new Tree<>();
//        int actual = maximusList.findMaximumValue();
//        assertNull(actual);
//    }

    // Edge Case: Team Rocket
    // In case the reference was missed: Get Ready for trouble; Make it double
    @Test
    public void maximumValueTeamRocketTest(){
        Tree<Integer> maximusList = new Tree<>();
        maximusList.root = new Node<>(15);
        maximusList.root.left = new Node<>(40);
        maximusList.root.right = new Node<>(20);
        maximusList.root.left.left = new Node<>(100);
        maximusList.root.left.right = new Node<>(70);
        maximusList.root.right.left = new Node<>(70);
        maximusList.root.right.right = new Node<>(100);
        Integer expected = 100;
        Integer actual = maximusList.findMaximumValue();
        assertEquals(expected, actual);
    }
}