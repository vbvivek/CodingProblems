package SortingAlogs;

import java.util.Arrays;

/*
Complexity O(n2)
Pick 1st element and find minimum element from Array and replace with it.
And move to next element
 */

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={3,2,11,10,70,6,4};
        selectionSort(arr,7);

    }

    public static void selectionSort(int[] array,int totalElement){

        for(int i=0;i<totalElement-1;i++){
            int minElem=array[i];
            for (int j=i+1;j<totalElement;j++){
                if(array[j]<array[i])
                {
                    minElem=array[j];
                    int temp=array[i];
                    array[i]=minElem;
                    array[j]=temp;
                }
            }
        }

        Arrays.stream(array).forEach(e-> System.out.print(e+" "));

    }
}
