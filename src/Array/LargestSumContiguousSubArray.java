package Array;

/*
Solution is based on Kadane's Alog

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
  (c) if(max_ending_here < 0)
            max_ending_here = 0
return max_so_far

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
