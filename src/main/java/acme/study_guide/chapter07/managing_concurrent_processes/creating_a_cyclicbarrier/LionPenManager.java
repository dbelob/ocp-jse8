package acme.study_guide.chapter07.managing_concurrent_processes.creating_a_cyclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {
    private void removeAnimals(int number) { System.out.println("Removing animals " + number); }
    private void cleanPen(int number) { System.out.println("Cleaning the pen " + number); }
    private void addAnimals(int number) { System.out.println("Adding animals " + number); }
    public void performTask(int number) {
        removeAnimals(number);
        cleanPen(number);
        addAnimals(number);
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for(int i=0; i<4; i++) {
                int finalI = i;
                service.submit(() -> manager.performTask(finalI));
            }
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
