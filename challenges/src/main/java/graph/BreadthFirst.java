package graph;


import java.util.*;


// Credit: https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/tutorial/
// Credit: https://stackabuse.com/graphs-in-java-breadth-first-search-bfs/
// Credit, Main Inspiration: https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
public class BreadthFirst {

    public static ArrayList<String> breadthFirst(Vertex input){

        if(input.getFromListOfEdges().isEmpty()){
            return null;
        }

        Set<Vertex> vertSet = new HashSet<>();
        Queue<Vertex> q = new LinkedList<>();
        ArrayList<String> result = new ArrayList<>();

        // Tried something from some code I wrote before, and it paid off B)
        q.add(input);
        result.add(input.getName());
        vertSet.add(input);

        while(!q.isEmpty()){
            Vertex tempothy = q.remove();
            List<Edge> neighborsHardWay = tempothy.getFromListOfEdges();

            for(Edge neighbor : neighborsHardWay){
                if(!vertSet.contains(neighbor.uziVert)){
                    q.add(neighbor.uziVert);
                    vertSet.add(neighbor.uziVert);
                    result.add(neighbor.uziVert.getName());
                }
            }
        }
        return result;
    }
}


