package SortingAlogs;

import java.util.Arrays;

/*
Compare 1st element with 2nd, Swap if 2nd is greater than 1st.
Keep on doing till end of array.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6};
        bubbleSort(array,6);

    }

    public static void bubbleSort(int[] array,int totalElements){

        int pass=0;

        for(int i=0;i<totalElements-1;i++){
            boolean flag=false;
            for(int j=0;j<totalElements-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag)
                break;
            pass++;
        }
        System.out.println(pass);
        Arrays.stream(array).forEach(e-> System.out.print(e+" "));

    }
}
