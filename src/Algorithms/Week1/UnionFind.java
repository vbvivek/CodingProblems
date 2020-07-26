package Algorithms.Week1;


import java.util.Arrays;

/*
Operation to perform:
Find Query - Check if 2 objects are in same componenet
Union - Replace components contatining 2 objects with their union
connected - check if 2 points are in same componenet
count - Number of component
Find - Component Aentifier for P
 */
public class UnionFind {

    private int[] A;

    UnionFind(int n){
        A=new int[n];
        for(int i=0;i<A.length;i++){
            A[i]=i;
        }
    }

    /*
    Take O(n) to make a connection
     */
    public void union(int p,int q){
        int pId=A[p];
        int qId=A[q];

        if(pId!=qId) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == pId) {
                    A[i] = qId;
                }
            }
        }
    }

    public Boolean isConnected(int p,int q){
        return A[p]==A[q];
    }



    public void printArray(){
        Arrays.stream(A).forEach(e-> System.out.print(e+" "));
    }

    public static void main(String[] args) {
        UnionFind unionFind=new UnionFind(10);
        unionFind.union(4,3);
        unionFind.union(3,8);
        unionFind.union(6,5);
        unionFind.union(9,4);
        unionFind.union(2,1);
        System.out.println(unionFind.isConnected(4,1));

        unionFind.printArray();

    }
}
