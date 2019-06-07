package acme.enthuware.objective_wise_tests.chapter11_concurrency.test05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(50000);
        return "DONE";
    }
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> future = es.submit(new MyCallable());
        System.out.println(future.get()); //1
        es.shutdownNow(); //2
    }
}
