package acme.study_guide.chapter07.creating_threads_with_the_executorservice.increasing_concurrency_with_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newCachedThreadPool();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory 1"));
            service.execute(() -> {
                        for (int i = 0; i < 3; i++)
                            System.out.println("Printing record: " + i);
                    }
            );
            service.execute(() -> System.out.println("Printing zoo inventory 2"));
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
