package acme.tests.chapter20.test15;

import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable c = new Callable() {
            @Override
            public Object call() throws Exception {
                return 10;
            }

//            public Object run() {return 10;}
        };
        ExecutorService s = Executors.newScheduledThreadPool(1);
        for(int i=0; i<10; i++) {
            Future f = s.submit(c);
            f.get();
        }
        s.shutdown();
        System.out.print("Done!");
    }
}
