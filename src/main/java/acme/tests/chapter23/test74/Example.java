package acme.tests.chapter23.test74;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e = Executors.newSingleThreadExecutor();
        Runnable r1 = () -> Stream.of(1, 2, 3).parallel();
        Callable r2 = () -> Stream.of(4, 5, 6).parallel();

//        Future<Stream> f1 = e.submit(r1);
        Future<?> f1 = e.submit(r1);
        Future<Stream> f2 = e.submit(r2);

        Stream<Integer> s = Stream.of(/* f1.get(), */ f2.get())
                .flatMap(p -> p);
//                .parallelStream();

        ConcurrentMap<Boolean, List<Integer>> r =
                s.collect(Collectors.groupingByConcurrent(i -> i % 2 == 0));
        System.out.println(r.get(false).size() + " " + r.get(true).size());
    }
}
