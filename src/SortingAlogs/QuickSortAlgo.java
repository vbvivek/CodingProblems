package SortingAlogs;

import java.util.Arrays;

public class QuickSortAlgo {

    public static void main(String[] args) {
        int array[] = {4,2,6,1,7,8,3,-1};

        quickSort(array,0,array.length-1);
        Arrays.stream(array).forEach(e-> System.out.print(e+" "));
    }


    public static void quickSort(int[] A,int start,int end){

        if(start<end){
            int pIndex=partitionArray(A,start,end);
            quickSort(A,start,pIndex-1);
            quickSort(A,pIndex+1,end);
        }


    }

    public static int partitionArray(int[] A,int start,int end){
        int pivot=A[end];
        int pivotindex=0;

        for(int i=0;i<end;i++){
            if(A[i]<pivot){
                swap(A,pivotindex,i);
                pivotindex++;
            }
        }
        swap(A,pivotindex,end);
        return pivotindex;

    }

    public static void swap(int[] A,int first,int second){
        int temp=A[first];
        A[first]=A[second];
        A[second]=temp;
    }
}

