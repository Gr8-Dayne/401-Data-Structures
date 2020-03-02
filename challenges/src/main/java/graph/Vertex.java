package graph;


import java.util.LinkedList;
import java.util.List;


public class Vertex {
    private String name;
    private List<Edge> listOfEdges;

    Vertex(String name){
        this.name = name;
        listOfEdges = new LinkedList<>();
    }

    public Edge addEdgeToVertex(Edge edge){
        listOfEdges.add(edge);
        return edge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getFromListOfEdges() {
        return listOfEdges;
    }

    public void setListOfEdges(List<Edge> listOfEdges) {
        this.listOfEdges = listOfEdges;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", listOfEdges=" + listOfEdges +
                '}';
    }
}
