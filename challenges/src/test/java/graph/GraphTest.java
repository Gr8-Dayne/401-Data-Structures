package graph;


import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;


public class GraphTest {

    // I couldn't use @Before here for some reason.
    Graph yeetimusPrime = new Graph();
    Vertex autobotOne = yeetimusPrime.AddNode("Bumble Bee");
    Vertex autobotTwo = yeetimusPrime.AddNode("Jazz");
    Vertex autobotThree = yeetimusPrime.AddNode("Iron Hide");
    Vertex autobotFour = yeetimusPrime.AddNode("Ratchet");
    Vertex autobotFive = yeetimusPrime.AddNode("Jet Fire");

    //  Node can be successfully added to the graph
    //  I tried assert equals and it had me running in circles until I realized what was happening...
    @Test
    public void addNodeTest() {
        Vertex decepticonOne = yeetimusPrime.AddNode("Star Scream");
//        System.out.println(yeetimusPrime.GetNodes());
        assertTrue("decepticonOne is in yeetimusPrime.", yeetimusPrime.GetNodes().contains(decepticonOne));
    }

    //  An edge can be successfully added to the graph
    @Test
    public void addEdgeTest() {
        yeetimusPrime.AddEdge(0, yeetimusPrime.AddNode("Barricade"), this.autobotOne);
        assertEquals("The weight difference between Bumble Bee and Barricade is 0 tons.", 0, autobotOne.getFromListOfEdges().get(0).weight);
    }

    //  A collection of all nodes can be properly retrieved from the graph
    @Test
    public void getNodesTest() {
        Set<Vertex> node_itron = yeetimusPrime.GetNodes();
        assertTrue(node_itron.contains(autobotThree));
        assertTrue(node_itron.contains(autobotTwo));
        assertTrue(node_itron.contains(autobotFive));
        assertTrue(node_itron.contains(autobotFour));
        assertTrue(node_itron.contains(autobotOne));
    }

    //  All appropriate neighbors can be retrieved from the graph
    //  Neighbors are returned with the weight between nodes included
    @Test
    public void getNeighborsTest() {
        yeetimusPrime.AddEdge(1, autobotOne, autobotTwo);
        yeetimusPrime.AddEdge(5, autobotTwo, autobotFive);
        yeetimusPrime.AddEdge(2, autobotThree, autobotTwo);
        assertEquals(1, yeetimusPrime.GetNeighbors(autobotTwo).get(0).weight);
        assertEquals(5, yeetimusPrime.GetNeighbors(autobotTwo).get(1).weight);
        assertEquals(2, yeetimusPrime.GetNeighbors(autobotTwo).get(2).weight);
    }

    //  The proper size is returned, representing the number of nodes in the graph
    @Test
    public void sizeTestHappy() {
        assertEquals(5, yeetimusPrime.Size());
    }

    //  A graph with only one node and edge can be properly returned
    @Test
    public void sizeTestOneNode() {
        Graph negatron = new Graph();
        Vertex decepticonThree = negatron.AddNode("Blackout");
        assertEquals(1, negatron.Size());
    }

    //  An empty graph properly returns null
    @Test
    public void sizeTestEmpty() {
        Graph negatron = new Graph();
        assertEquals(0, negatron.Size());
    }
}