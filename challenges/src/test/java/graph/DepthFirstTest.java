package graph;


import org.junit.Test;
import static org.junit.Assert.*;


public class DepthFirstTest {

    Graph yeetimusPrime = new Graph();
    Vertex autobotOne = yeetimusPrime.AddNode("Bumble Bee");
    Vertex autobotTwo = yeetimusPrime.AddNode("Jazz");
    Vertex autobotThree = yeetimusPrime.AddNode("Iron Hide");
    Vertex autobotFour = yeetimusPrime.AddNode("Ratchet");
    Vertex autobotFive = yeetimusPrime.AddNode("Jet Fire");

    @Test
    public void depthFirstTest() {
        yeetimusPrime.AddEdge(2, autobotOne, autobotTwo);
        yeetimusPrime.AddEdge(4, autobotOne, autobotThree);
        yeetimusPrime.AddEdge(2, autobotThree, autobotFour);
        yeetimusPrime.AddEdge(3, autobotFour, autobotFive);
        String expected = "[Bumble Bee, Iron Hide, Ratchet, Jet Fire, Jazz]";
        String actual = String.valueOf(DepthFirst.depthFirst(autobotOne));
        assertEquals(expected, actual);
    }
}