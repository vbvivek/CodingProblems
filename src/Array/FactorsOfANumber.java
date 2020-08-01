package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class FactorsOfANumber {

    public static void main(String[] args) {

        int[] A=allFactors(15);
        Arrays.stream(A).forEach(e-> System.out.print(e+" "));

    }

    public static int[] allFactors(int A) {


        ArrayList<Integer> a=new ArrayList();


        if(A!=1)
            a.add(1);

        double sqrtN=Math.sqrt(A);
        for(int i=2;i<=sqrtN;i++){
            if(A%i==0) {
                a.add(i);
                if(i!=sqrtN)
                    a.add(A/i);
            }

        }
        a.add(A);
        int[] arr = new int[a.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=a.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }

    /*
    InterviewBit Soution
     */

    public ArrayList<Integer> allFactorsAL(int a) {

        ArrayList<Integer> factors = new ArrayList<Integer>();

        int sqrt = (int) Math.sqrt(a);
        for (int i = 1; i <= sqrt; i++) {

            if (a % i == 0) {
                factors.add(i);
            }
        }

        for (int i = factors.size() - 1; i >= 0; i--) {

            int num = factors.get(i);
            if (num != a/num) factors.add(a/num);

        }
        return factors;

    }
}
