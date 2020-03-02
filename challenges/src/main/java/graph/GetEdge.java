package graph;


public class GetEdge {

    // Shane gave me this idea.
    static class Result {
        boolean yesOrNo;
        int price;
        public Result(boolean yesOrNo, int price){
            this.yesOrNo = yesOrNo;
            this.price = price;
        }
        public String toString(){
            return "Possible: " +  this.yesOrNo + ", Cost: $" + this.price;
        }
    }

    public static Result getEdge(Graph G, String[] cities){
        if(cities.length < 2 || G.Size() < 2){
            throw new IllegalArgumentException("Something Went Wrong");
        }
        Vertex curr = null;
        Result result = new Result(false,0);
        for(Vertex vertex : G.GetNodes()){
            if(cities[0].equals(vertex.getName())){ curr = vertex;}
        }
        for(int i = 1; i < cities.length; i++){
            result.yesOrNo = false;
            for(Edge ed : curr.getFromListOfEdges()){
                if(ed.getUziVert().getName().equals(cities[i])){
                    result.yesOrNo = true;
                    result.price += ed.weight;
                    curr = ed.getUziVert();
                }
            }
        }
        return result;
    }
}


