package String;

public class ReverseWord {

    public static void main(String[] args) {

        String str= "i.like.this.program.very.much";
       reverseString(str);

    }

    public static void reverseString(String input){

        String[] str=input.split("\\.");
        StringBuilder reversedString=new StringBuilder();
        for (int i=str.length-1;i>0;i--){
            reversedString.append(str[i]).append(".");

        }
        reversedString.append(str[0]);

        System.out.println("Reverse is "+reversedString);
    }
}
