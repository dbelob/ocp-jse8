package acme.study_guide.chapter07.creating_threads_with_the_executorservice.waiting_for_results;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResults.counter++;
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
