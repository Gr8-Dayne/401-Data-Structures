package graph;


import org.junit.Test;
import static org.junit.Assert.*;


public class BreadthFirstTest {

    Graph yeetimusPrime = new Graph();
    Vertex autobotOne = yeetimusPrime.AddNode("Bumble Bee");
    Vertex autobotTwo = yeetimusPrime.AddNode("Jazz");
    Vertex autobotThree = yeetimusPrime.AddNode("Iron Hide");
    Vertex autobotFour = yeetimusPrime.AddNode("Ratchet");
    Vertex autobotFive = yeetimusPrime.AddNode("Jet Fire");

    @Test
    public void breadthFirstTest() {
        yeetimusPrime.AddEdge(2, autobotOne, autobotTwo);
        yeetimusPrime.AddEdge(4, autobotTwo, autobotFive);
        yeetimusPrime.AddEdge(2, autobotFive, autobotOne);
        yeetimusPrime.AddEdge(3, autobotThree, autobotTwo);
        yeetimusPrime.AddEdge(1, autobotOne, autobotFour);
        String expected = "[Jet Fire, Jazz, Bumble Bee, Iron Hide, Ratchet]";
        String actual = String.valueOf(BreadthFirst.breadthFirst(autobotFive));
        assertEquals(expected, actual);
    }
}