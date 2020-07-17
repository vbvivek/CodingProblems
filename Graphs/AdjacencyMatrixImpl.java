package main.java.Graphs;

import java.util.Arrays;

/*
UnDirected Graph Implementation
 */

public class AdjacencyMatrixImpl {
    private int numberOfVertex;
    private int[][] matrixGraph;
    private int[] vertexNode;
    private int maxVertexIndex;

    AdjacencyMatrixImpl(int vertex){
        this.numberOfVertex=vertex;
        this.matrixGraph=new int[vertex][vertex];
        this.vertexNode= new int[vertex];
    }

    public void addVertex(int data){
        vertexNode[maxVertexIndex]=data;
        maxVertexIndex++;
    }

    public  void printVertex(){
        Arrays.stream(vertexNode).forEach(e-> System.out.print(e+" "));
    }

    public void addEdge(int firstVertex,int secondVertex){
        matrixGraph[firstVertex][secondVertex]=1;
        matrixGraph[secondVertex][firstVertex]=1;
    }

    public void removeEdge(int firstVertex,int secondVertex){
        matrixGraph[firstVertex][secondVertex]=0;
        matrixGraph[secondVertex][firstVertex]=0;
    }

    public void printEdges(){

        for(int i=0;i<numberOfVertex;i++){
            for(int j=0;j<numberOfVertex;j++){
                if(matrixGraph[i][j]==1){
                    System.out.println(i+"------"+j);
                }
            }
        }

    }

    public void printMatrix(){
        for(int i=0;i<numberOfVertex;i++){
            for(int j=0;j<numberOfVertex;j++){

                    System.out.print(matrixGraph[i][j]);
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        AdjacencyMatrixImpl adjacencyMatrix =new AdjacencyMatrixImpl(5);
        adjacencyMatrix.addVertex(0);
        adjacencyMatrix.addVertex(1);
        adjacencyMatrix.addVertex(2);
        adjacencyMatrix.addVertex(3);
        adjacencyMatrix.addVertex(4);

        adjacencyMatrix.printVertex();
        System.out.println();

        adjacencyMatrix.addEdge(0,1);
        adjacencyMatrix.addEdge(1,2);
        adjacencyMatrix.addEdge(2,3);
        adjacencyMatrix.addEdge(3,1);
        adjacencyMatrix.addEdge(3,4);
        adjacencyMatrix.addEdge(0,4);
        adjacencyMatrix.addEdge(4,1);

        adjacencyMatrix.printMatrix();
    }

}

/*
Array will have vertex & Edges will be saved on Matrix
 */
