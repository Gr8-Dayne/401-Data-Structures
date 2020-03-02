package graph;


import java.util.*;


// Credit: https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
public class DepthFirst {

    public static ArrayList<String> depthFirst(Vertex input){

        if(input.getFromListOfEdges().isEmpty()){
            return null;
        }

        Set<Vertex> vertSet = new HashSet<>();
        Stack<Vertex> S = new Stack<>();
        ArrayList<String> result = new ArrayList<>();

        // Tried something from some code I wrote before, and it paid off.
        // Again
        // I hope
        // Not really actually
        S.add(input);
        vertSet.add(input);

        while(!S.isEmpty()){

            Vertex tempothy = S.pop();
            List<Edge> neighbors = tempothy.getFromListOfEdges();

            for(Edge neighbor : neighbors){
                if(!vertSet.contains(neighbor.uziVert)){
                    S.add(neighbor.uziVert);
                    vertSet.add(neighbor.uziVert);
                }
            }
            result.add(tempothy.toString());
        }
        return result;
    }
}
