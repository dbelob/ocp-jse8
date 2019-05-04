package acme.tests.chapter20.test07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TpsReport {
    public void submitReports() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Future bosses = service.submit(() -> System.out.print(""));
        service.shutdown();
        System.out.print(bosses.get());
    }

    public static void main(String[] memo) throws ExecutionException, InterruptedException {
        new TpsReport().submitReports();
    }
}
