package SortingAlogs;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int array[] = {4,2,6,1,7,8,3};

        mergeSort(array);

        Arrays.stream(array).forEach(e-> System.out.print(e+" "));
    }

    public static void merge(int[] left, int[] right, int[] A) {

        int i=0,j=0;
        int k=0;

        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                A[k]=left[i];

                i++;
            }
            else {
                A[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
            A[k]=left[i];
            i++;
            k++;
        }

        while (j<right.length){
            A[k]=right[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int A[]) {

            if(A.length<2)
                return;
        int leftLength=A.length/2;
        int rightLength=A.length-leftLength;

            int[] left=new int[leftLength];
            int[] right=new int[rightLength];
            int k=0;

            for(int i=0;i<left.length;i++){
                left[i]=A[k];
                k++;
            }

            for(int i=0;i<right.length;i++){
                right[i]=A[k];
                k++;
            }

            mergeSort(left);
            mergeSort(right);
            merge(left,right,A);

    }
}
