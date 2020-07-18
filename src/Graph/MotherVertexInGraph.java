package Graph;

/*
Vertex from where paths to all other vertex are availabe
 */

import java.util.Iterator;
import java.util.Stack;

public class MotherVertexInGraph extends DirectedGraph  {

    MotherVertexInGraph(int V) {
        super(V);
    }

    /*
        Not Efficient Approach as we are checking all vertex one by one
        O(N(V+E))

     */

    public void findMotherVertex(){

        for(int i=0;i<V;i++){
            int scanedVertexCount=0;
            boolean isVisited[]=new boolean[V];
            Stack<Integer> stack=new Stack<>();
            isVisited[i]=true;
            stack.push(i);
            while (!stack.isEmpty()){
                int element=stack.pop();
                scanedVertexCount++;
                Iterator<Integer> itr=adjList[element].listIterator();
                while (itr.hasNext()){
                    int e=itr.next();
                    if(!isVisited[e]){
                        stack.push(e);
                        isVisited[e]=true;
                    }
                }
            }

            if(scanedVertexCount==V){
                System.out.println("Mother Vertex Found : "+i);
                return;
            }



        }

    }

    public static void main(String[] args) {

        DirectedGraph graph=new MotherVertexInGraph(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(4,1);
        graph.addEdge(5,2);
        graph.addEdge(5,6);
        graph.addEdge(6,0);
        graph.addEdge(6,4);

        graph.findMotherVertex();

    }


}


