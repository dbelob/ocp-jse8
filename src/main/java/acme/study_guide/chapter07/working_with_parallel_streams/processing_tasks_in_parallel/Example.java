package acme.study_guide.chapter07.working_with_parallel_streams.processing_tasks_in_parallel;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        System.out.print("stream().forEach():                ");

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .forEach(s -> System.out.print(s + " "));

        System.out.print("\nparallelStream().forEach():        ");

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .forEach(s -> System.out.print(s + " "));

        System.out.print("\nparallelStream().forEachOrdered(): ");

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .forEachOrdered(s -> System.out.print(s + " "));
    }
}
