package graph;


import java.util.*;


// Credit: https://frontrowviews.com/Home/Event/Play/5e1929feeee6d91a185440af
// Credit: https://www.baeldung.com/java-graphs
// Credit: https://docs.oracle.com/middleware/11119/jdev/api-reference-esdk/javax/ide/util/Graph.html
// Credit: https://stackabuse.com/graphs-in-java/
// Credit: https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
// Credit: https://algs4.cs.princeton.edu/41graph/Graph.java.html (CSS lol)
public class Graph {

    public static Set<Vertex> vertexSet;

    public Graph() {
        this.vertexSet = new HashSet<Vertex>();
    }

    public Vertex AddNode(String name){
        Vertex newVertex = new Vertex(name);
        vertexSet.add(newVertex);
        return newVertex;
    }

    public void AddEdge(int weight, Vertex thingOne, Vertex thingTwo){

        if(vertexSet.contains(thingOne) && vertexSet.contains(thingTwo)){

            for(Vertex vertex : vertexSet){

                if(vertex.equals(thingOne)){
                    vertex.addEdgeToVertex(new Edge(weight, thingTwo));
                }

                if (vertex.equals(thingTwo)) {
                    vertex.addEdgeToVertex(new Edge(weight, thingOne));
                }
            }
        } else {
            throw new IllegalArgumentException("No Thing Found");
        }
    }

    public Set<Vertex> GetNodes(){
        return vertexSet;
    }

    public List<Edge> GetNeighbors(Vertex vertexIn){
        return vertexIn.getFromListOfEdges();
    }

    public int Size(){
        return vertexSet.size();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertexSet=" + vertexSet +
                '}';
    }
}


