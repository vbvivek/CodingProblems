package Graph;

import java.util.ArrayList;
import java.util.List;

/*
List Array will have objects of ArrayList which will save adjacent nodes
 */

public class AdjacencyListImpl {
    private int totalVertex;
    private List<ArrayList<Integer>> vertexArray;
    AdjacencyListImpl(int vertex){
        this.totalVertex=vertex;
        this.vertexArray=new ArrayList<ArrayList<Integer>>(vertex);

        for (int i=0;i<vertex;i++){
            this.vertexArray.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int start,int end){
        vertexArray.get(start).add(end);
        vertexArray.get(end).add(start);
    }

    public void printGraph(){
        for (int i=0;i<totalVertex;i++){
            System.out.println("Adjacency List for Vertex "+i);
            for(int j=0;j<vertexArray.get(i).size();j++){
                System.out.print("->"+vertexArray.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        AdjacencyListImpl graph=new AdjacencyListImpl(5);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        graph.printGraph();

    }
}
