package acme.study_guide.chapter07.creating_threads_with_the_executorservice.scheduling_tasks;

import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();

            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> "Monkey";

            Future<?> result1 = service.schedule(task1, 10, /* TimeUnit.SECONDS */ TimeUnit.MILLISECONDS);
            Future<?> result2 = service.schedule(task2, 8, /* TimeUnit.MINUTES */ TimeUnit.SECONDS);
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
