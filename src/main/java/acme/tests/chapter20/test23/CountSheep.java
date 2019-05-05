package acme.tests.chapter20.test23;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class CountSheep extends RecursiveAction {
    static int[] sheep = new int[] {1,2,3,4};
    final int start;
    final int end;
    static int count = 0;
    public CountSheep(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void compute() {
        if(end-start<2) {
            count+=sheep[start];
            return;
        } else {
            int middle = start + (end-start)/2;
            invokeAll(new CountSheep(start,middle),
                    new CountSheep(middle,end));
        }
    }
    public static void main(String[] night) {
        ForkJoinPool pool = new ForkJoinPool();
        CountSheep action = new CountSheep(0,sheep.length);
        pool.invoke(action);
        pool.shutdown();
        System.out.print(action.count);
    }
}
