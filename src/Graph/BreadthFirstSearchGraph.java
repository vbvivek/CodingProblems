package Graph;

import java.util.*;

public class BreadthFirstSearchGraph {

    public static void main(String[] args) {
        Graph graph=new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        graph.BFS(3);
    }

}

class Graph{

    private int V;
    private LinkedList<Integer> adjList[];

    Graph(int V){
        this.V=V;
        this.adjList=new LinkedList[V];

        for(int i=0;i<V;i++){
            this.adjList[i]=new LinkedList<>();
        }
    }

    public void addEdge(int startV,int endV){
        adjList[startV].add(endV);
        adjList[endV].add(startV);
    }

    public void BFS(int startVertex){
        boolean isVisited[]=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        isVisited[startVertex]=true;
        queue.add(startVertex);

        while (!queue.isEmpty()){
            int element=queue.remove();
            System.out.print(element+" ");
            Iterator<Integer> itr=adjList[element].listIterator();
            while (itr.hasNext()){

                int neighbourVertex=itr.next();
                if(!isVisited[neighbourVertex]) {
                    queue.add(neighbourVertex);
                    isVisited[neighbourVertex] = true;
                }
            }

        }

    }


}
