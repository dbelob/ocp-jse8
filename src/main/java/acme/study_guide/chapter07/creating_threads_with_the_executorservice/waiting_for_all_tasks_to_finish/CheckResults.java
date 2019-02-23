package acme.study_guide.chapter07.creating_threads_with_the_executorservice.waiting_for_all_tasks_to_finish;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CheckResults {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(() -> System.out.println("Printing zoo inventory"));
            service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    System.out.println("Printing record: " + i);
                }
            });
            service.submit(() -> System.out.println("Printing zoo inventory"));
        } finally {
            if (service != null) service.shutdown();
        }

        if (service != null) {
            service.awaitTermination(1, TimeUnit.NANOSECONDS);
            // Check whether all tasks are finished
            if (service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
