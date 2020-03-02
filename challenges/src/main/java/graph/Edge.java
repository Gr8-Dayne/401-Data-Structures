package graph;


public class Edge {
    int weight;
    Vertex uziVert;

    public Edge(int weight, Vertex uziVert) {
        this.weight = weight;
        this.uziVert = uziVert;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getUziVert() {
        return uziVert;
    }

    public void setUziVert(Vertex uziVert) {
        this.uziVert = uziVert;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", uziVert=" + uziVert +
                '}';
    }
}