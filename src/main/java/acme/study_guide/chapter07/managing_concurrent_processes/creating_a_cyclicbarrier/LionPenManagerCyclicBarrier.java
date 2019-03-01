package acme.study_guide.chapter07.managing_concurrent_processes.creating_a_cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManagerCyclicBarrier {
    private void removeAnimals(int number) { System.out.println("Removing animals " + number); }
    private void cleanPen(int number) { System.out.println("Cleaning the pen " + number); }
    private void addAnimals(int number) { System.out.println("Adding animals " + number); }
    public void performTask(CyclicBarrier c1, CyclicBarrier c2, int number) {
        try {
            removeAnimals(number);
            c1.await();
            cleanPen(number);
            c2.await();
            addAnimals(number);
        } catch (InterruptedException | BrokenBarrierException e) {
// Handle checked exceptions here
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManagerCyclicBarrier manager = new LionPenManagerCyclicBarrier();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4,
                    () -> System.out.println("*** Pen Cleaned!"));
            for(int i=0; i<4; i++) {
                int finalI = i;
                service.submit(() -> manager.performTask(c1,c2, finalI));
            }
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
