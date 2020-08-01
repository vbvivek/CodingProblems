package Other;

import java.util.*;
import java.util.stream.Collectors;

public class StringToMap {

    public static void main(String[] args) {

        String str="Item1=A,B,C;Item2=X,Y,Z,A;Item3=M";

        HashMap<String, List<String>> result=formatPackageCatagories(str);
        System.out.println(result.toString());
        //result.keySet().iterator().forEachRemaining(System.out::println);
        result.keySet().stream().forEach(System.out::println);
        result.values().stream().forEach(System.out::println);
    }

    public static HashMap<String, List<String>> formatPackageCatagories(String str){

      /*  HashMap<String,ArrayList<String>> packageCatagories;

        String[] catagories=str.split(";");
        for (String s:catagories
             ) {

            packageCatagories.
        }
    */
        //HashMap<String, Integer> map = (HashMap<String, Integer>) Arrays.asList(str.split(";")).stream().map(s -> s.split("=")).collect(Collectors.toMap(e -> e[0], e -> Integer.parseInt(e[1])));
        HashMap<String, List<String>> map1 = (HashMap<String, List<String>>)
                Arrays.asList(str.split(";"))
                        .stream()
                        .map(s -> s.split("="))
                        .collect(Collectors.toMap(e -> e[0],e-> Arrays.asList(e[1].split(",")) ));


        //System.out.println(map1.toString());

        return map1;
    }
}
