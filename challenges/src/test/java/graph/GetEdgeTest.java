package graph;


import org.junit.Test;
import static org.junit.Assert.*;


public class GetEdgeTest {

    Graph theGraphening = new Graph();
    Vertex Berlin = theGraphening.AddNode("Berlin");
    Vertex Moscow = theGraphening.AddNode("Moscow");
    Vertex London = theGraphening.AddNode("London");
    Vertex Paris = theGraphening.AddNode("Paris");
    Vertex Egypt = theGraphening.AddNode("Egypt");
    Vertex Amsterdam = theGraphening.AddNode("Amsterdam");

    @Test
    public void getEdgeTest() {
        theGraphening.AddEdge(150, Moscow, London);
        theGraphening.AddEdge(75, London, Paris);
        theGraphening.AddEdge(80, London, Berlin);
        theGraphening.AddEdge(600, London, Egypt);
        theGraphening.AddEdge(10, Berlin, Amsterdam);
        String[] cities = new String[]{"London", "Berlin", "Amsterdam"};
        String expected = "Possible: true, Cost: $90";
        String actual = GetEdge.getEdge(theGraphening, cities).toString();
        assertEquals(expected, actual);
    }

    @Test
    public void getEdgeFailure() {
        theGraphening.AddEdge(150, Moscow, London);
        theGraphening.AddEdge(75, London, Paris);
        theGraphening.AddEdge(80, London, Berlin);
        theGraphening.AddEdge(600, London, Egypt);
        theGraphening.AddEdge(10, Berlin, Amsterdam);
        String[] cities = new String[]{"London", "Egypt", "Moscow"};
        String expected = "Possible: false, Cost: $600";
        String actual = GetEdge.getEdge(theGraphening, cities).toString();
        assertEquals(expected, actual);
    }

    //
    // Throws exception like it should
    //
//    @Test
//    public void getEdgeEdgeCase() {
//        String[] cities = new String[]{"London"};
//        String expected = "false, 0";
//        String actual = GetEdge.getEdge(theGraphening, cities).toString();
//        assertNotEquals(expected, actual);
//    }
}