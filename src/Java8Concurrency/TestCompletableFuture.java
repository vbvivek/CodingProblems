package Java8Concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<InputData> task1=getData1();
        CompletableFuture<InputData> task2=getData2();
        CompletableFuture.allOf(task1,task2).join();

    }

    public static CompletableFuture<InputData> getData1(){
        InputData i=new InputData();
        i.setName("Vivek");
        System.out.println(i.getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture(i);

    }

    public static CompletableFuture<InputData> getData2(){
        InputData i=new InputData();
        i.setName("Bhatt");
        System.out.println(i.getName());
        return CompletableFuture.completedFuture(i);

    }
}


class InputData{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
