package String;

public class PermutationOfString {

    public static void main(String[] args) {

        String str="ABC";
        permutationOfString(str,0,str.length()-1);

    }

    public static void permutationOfString(String str,int start,int end){

        if(start==end){
            System.out.println(str);
        }
        else {
                for (int i=start;i<=end;i++){
                    str=swap(str,start,i);
                    permutationOfString(str,start+1,end);
                    str=swap(str,start,i);
                }
        }


    }

    public static String swap(String s,int f,int e){
        char[] charArray=s.toCharArray();
        char temp=charArray[f];
        charArray[f]=charArray[e];
        charArray[e]=temp;
        return String.valueOf(charArray);

    }
}
