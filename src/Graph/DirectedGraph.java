package Graph;


import java.util.LinkedList;

/*
General Directed Graph -----> one way Edge
 */

public abstract class DirectedGraph {

    protected int V;
    protected LinkedList<Integer> adjList[];



    DirectedGraph(int V) {
        this.V = V;
        this.adjList = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            this.adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int startV, int endV) {
        adjList[startV].add(endV);
    }

    abstract public void  findMotherVertex();

}