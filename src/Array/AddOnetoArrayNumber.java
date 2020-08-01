package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOnetoArrayNumber {

    public static void main(String[] args) {
        int[] A={9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] B=plusOne(A);


        Arrays.stream(B).forEach(e-> System.out.print(e));
    }

    public static int[] plusOne(int[] A) {

        int nonZeroIndex = 0;
        int i = 0;
        int countZero = 0;
        while (A[i] == 0 && i < A.length - 1) {
            nonZeroIndex++;
            i++;
            countZero++;
        }

        int addNumber = A[A.length - 1] + 1;


        if (addNumber % 10 != 0) {
            A[A.length - 1] = addNumber;
            int[] newArr = new int[A.length - countZero];
            for (int j = 0; j < newArr.length; j++) {
                newArr[j] = A[nonZeroIndex];
                nonZeroIndex++;
            }

            return newArr;
        } else {
            int[] arrB=new int[A.length - countZero];
            int last = A.length - 1;
            int carry = 1;
            while (last >= nonZeroIndex) {
                int nonZZ=nonZeroIndex;
                if ((A[last] + carry) % 10 == 0) {
                    carry = (A[last] + carry) / 10;
                    A[last] = 0;
                    last--;
                } else {
                    A[last] = A[last] + carry;

                    for (int t=0;t<arrB.length && nonZZ<A.length;t++){
                        arrB[t]=A[nonZZ];
                        nonZZ++;
                    }
                    break;
                }
            }
            if (last < nonZeroIndex) {
                int nonZ = nonZeroIndex;
                int[] newA = new int[A.length - countZero + 1];
                newA[0] = carry;
                for (int x = 1; x < newA.length && nonZ < A.length; x++) {
                    newA[x] = A[nonZ];
                    nonZ++;
                }

                return newA;
            }

            return  arrB;
        }


    }
}
