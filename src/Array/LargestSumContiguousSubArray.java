package Array;

/*
Solution is based on Kadane's Alog
 */

import java.util.Arrays;

public class LargestSumContiguousSubArray {

    public static void main(String[] args) {
        int[] array={-2,-3,4,-1,-2,1,5,-3};
        int maxSum=0,maxTillNow=0;
        int start=0,end=0,s=0;

        for (int i=0; i< array.length;i++) {
            maxTillNow=maxTillNow+array[i];

            if(maxTillNow<0) {
                maxTillNow = 0;
                s=i+1;
            }
            else if(maxSum<maxTillNow) {
                maxSum = maxTillNow;
                start=s;
                end=i;

            }


        }

        System.out.println("Larget Sum Contiguous SubArray "+maxSum);
        System.out.println("Start: "+start+" End: "+end);

    }


}
