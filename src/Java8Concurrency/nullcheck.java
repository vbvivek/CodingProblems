package Java8Concurrency;

public class nullcheck {

    public static void main(String[] args) {
        function(null);
    }

    public static void function(String o){
        System.out.println("Str");
    }
    public static void function(Object o){
        System.out.println("Object");
    }

    public static void function(int o){
        System.out.println("int");
    }


}
