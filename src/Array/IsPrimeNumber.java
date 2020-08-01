package Array;

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
}
