package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Triplets {


    public static int countTriplets(int[] A){

        int countTriplets=0;
        int f0=0;
        HashMap<Integer,Integer> feq=findFrequency(A);
        Iterator<Map.Entry<Integer,Integer>> itr=feq.entrySet().iterator();
        // 3 Zeros  000
        if(feq.containsKey(0)) {
             f0 = feq.get(0);
            countTriplets = (f0 * (f0 - 1) * (f0 - 2)) / 6;
        }


        while (itr.hasNext()){
            Map.Entry<Integer,Integer> entry=itr.next();
            if(entry.getValue()>=2){
                int f1=entry.getValue();
                countTriplets=countTriplets+((f0*f1*(f1-1))/2);
                if(feq.containsKey(2*entry.getKey())){
                    countTriplets=countTriplets+(f1*(f1-1)*feq.get(2*entry.getKey()))/2;
                }
            }
        }

        for (Integer i:feq.keySet()
             ) {
            for (Integer j:feq.keySet()
                 ) {

                if(i!=j && (feq.containsKey(i+j))){
                    countTriplets=countTriplets+(feq.get(i)*feq.get(j)*feq.get(i+j));
                }

            }
        }

        return countTriplets;

    }

    public static HashMap<Integer,Integer> findFrequency(int[] A){

        HashMap<Integer,Integer> mapF=new HashMap<>();

        for(int i=0;i<A.length;i++){

            if(mapF.containsKey(A[i])){
                mapF.put(A[i],mapF.get(A[i])+1);
            }
            else {
                mapF.put(A[i],1);
            }
        }
        return mapF;
    }

    /*
    Array Implementation
     */

    public static int findTripletUsingArray(int[] A){

        Arrays.sort(A);
        int max=A[A.length-1];
        int[] feqArray=new int[max+1];

        for (int i=0;i<A.length;i++){
            feqArray[A[i]]++;
        }
        int countTriplets=0;
        //000
        countTriplets=(feqArray[0]*(feqArray[0]-1)*(feqArray[0]-1))/6;

       //0xx
        for(int i=1;i<feqArray.length;i++){
            if(feqArray[i]>=2) {
                countTriplets = countTriplets + (feqArray[0] * feqArray[i] * (feqArray[i] - 1)) / 2;

                //x,x,2x
                if(2*i<feqArray.length){
                    if(feqArray[2*i]!=0){
                        countTriplets=countTriplets+(feqArray[i]*(feqArray[i]-1)*feqArray[2*i])/2;
                    }
                }
            }
        }

        for(int i=1;i<feqArray.length;i++){
            for(int j=i+1;i+j<feqArray.length;j++){
                countTriplets=countTriplets+feqArray[i]*feqArray[j]*feqArray[i+j];
            }
        }

        return countTriplets;

    }


    /*
    End
     */


    public static void main(String[] args) {

        int[] arr={1,1,1,2,2};

        int countT=findTripletUsingArray(arr);
        System.out.println("Count is "+countT);

    }

}
