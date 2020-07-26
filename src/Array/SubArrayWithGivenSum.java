package Array;

public class SubArrayWithGivenSum {


    public static void main(String[] args) {

        int[] A={1,2,3,4,5,6,7,8,9,10};
       // int[] A={1,4,0,0,3,10,5};
       // findSubArray(A,19);
        findSubArrayEfficient(A,202);
        //subArraySum(A,A.length,15);

    }

    /*
    Efficient Algo O(n)
     */
    public static void findSubArrayEfficient(int[] A,int sum){

        int start=0;
        int tempSum=A[0];
        Boolean isfind=false;

        for(int i=1;i<=A.length;i++){
            while (tempSum>sum && start<i-1){
                tempSum=tempSum-A[start];
                start++;

            }

            if(tempSum==sum){
                int p=i-1;
                System.out.println(start+" "+p);
                isfind=true;
                break;
            }

            if(i<A.length)
            tempSum=tempSum+A[i];
        }

        if(!isfind)
            System.out.println("-1");




    }



    /*
    Complexity O(n2) - Poor Performance
     */
    public static void findSubArray(int[] A,int sum){
        int tempSum=sum;
        int start=0;
        int end=0;
        for(int i=0;i<A.length;i++){
           if(tempSum==0)
               break;
            start=i;
            tempSum=sum;
            for(int j=i;j<A.length;j++){

                if(tempSum>=0) {

                        tempSum = tempSum - A[j];
                        if (tempSum == 0) {
                            end = j;
                            break;
                        }


                }
                else {
                    break;
                }
            }
        }
       if(tempSum==0)
        System.out.println("Sub Array is starting at "+start+" ending at "+end);
       else
           System.out.println("-1");
    }
}
