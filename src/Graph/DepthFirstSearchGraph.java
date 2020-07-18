package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearchGraph {

    public static void main(String[] args) {
        DFSGraph graph=new DFSGraph(5);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        graph.DFS(0);
    }


}

class DFSGraph{

    private int V;
    private LinkedList<Integer> adjList[];

    DFSGraph(int V){
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

    public void DFS(int startVertex){
        boolean isVisited[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();

        isVisited[startVertex]=true;
        stack.push(startVertex);

        while (!stack.isEmpty()){
            int element=stack.pop();
            System.out.print(element+" ");
            Iterator<Integer> itr=adjList[element].listIterator();
            while (itr.hasNext()){
                int e=itr.next();
                if(!isVisited[e]){
                    stack.push(e);
                    isVisited[e]=true;
                }
            }

        }
    }


}