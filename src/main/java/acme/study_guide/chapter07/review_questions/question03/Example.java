package acme.study_guide.chapter07.review_questions.question03;

import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        service.scheduleWithFixedDelay(() -> { // w1
        ((ScheduledExecutorService) service).scheduleWithFixedDelay(() -> { // w1
            System.out.println("Open Zoo");
//            return null; // w2
        }, 0, 1, TimeUnit.MINUTES);
        Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
        System.out.println(result.get()); // w4
    }
}
