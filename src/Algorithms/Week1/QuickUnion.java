package Algorithms.Week1;

public class QuickUnion {

    private int A[];

    private int size[]; // Weighted Quick Union

    QuickUnion(int n){
        A=new int[n];

        for(int i=0;i<n;i++){
            A[i]=i;
        }
    }

    private int findRoot(int i){
        while (A[i]!=i){
            i=A[i];
        }
        return i;
    }

    public Boolean isConnected(int p,int q){
        return findRoot(p)==findRoot(q);
    }

    public void union(int p,int q){
        int i=findRoot(p);
        int j=findRoot(q);

        if(i==j)
            return;

         if(size[i]<size[j]){
            A[i]=j;
            size[j]=size[j]+size[i];
        }
         else {
             A[j]=i;
             size[i]=size[i]+size[j];
         }



        /*
        Above one can further be optimized by always moving small tree as child of large tree
        Here we need to take an extra array to maintain the size of a tree
         */
    }


    public static void main(String[] args) {

    }
}
