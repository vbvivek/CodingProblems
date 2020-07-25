package SortingAlogs;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array={2,8,1,7,4,3,0,100,65,27,63};
        insertionSort(array,11);


    }

    public static void insertionSort(int[] array,int totalElement){

        int sortedElem=array[0];
        int j;

       /* for(int i=1;i<totalElement;i++){
           int swapWithIndex=-1;
            int compareElem=array[i];
            j=i;
            while (j>0){
                if(compareElem<array[j-1]){
                   array[j]=array[j-1];
                    swapWithIndex=j-1;
                }
                j--;
            }
            if(swapWithIndex!=-1)
            array[swapWithIndex]=compareElem;

        }*/

        for(int i=1;i<totalElement;i++){
            int value=array[i];
            int hole=i;
            while (hole>0 && value<array[hole-1]){
                array[hole]=array[hole-1];
                hole=hole-1;
            }
            array[hole]=value;
        }

        Arrays.stream(array).forEach(e-> System.out.print(e+" "));
    }

}
