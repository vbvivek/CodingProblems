package Array;

import java.util.ArrayList;

public class IsPrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(17));

    }

    public static int isPrime(int A) {

        if(A==1)
            return 0;

        int factor=0;


        for(int i=2;i<=Math.sqrt(A);i++){

            if(A%i==0){
                factor=1;
                break;
            }
        }
        if(factor==0)
            return 1;

        return 0;
    }

    public static int[] sieve(int A) {

        int[] isPrimeArray=new int[A+1];

        isPrimeArray[0]=0;
        isPrimeArray[1]=0;

        for(int i=2;i<isPrimeArray.length;i++){
            isPrimeArray[i]=1;
        }


        for(int j=2;j<Math.sqrt(A);j++){
            for(int x=2;j*x<=A;x++){

                if(isPrimeArray[j]==1){
                    isPrimeArray[x*j]=0;
                }
            }
        }

        ArrayList<Integer> arr=new ArrayList<>();
        for(int k=0;k<isPrimeArray.length;k++){
            if(isPrimeArray[k]==1)
                arr.add(k);
        }

        int[] rarr=new int[arr.size()];
        for(int i=0;i<rarr.length;i++){
            rarr[i]=arr.get(i);
        }
        return rarr;


    }
}
