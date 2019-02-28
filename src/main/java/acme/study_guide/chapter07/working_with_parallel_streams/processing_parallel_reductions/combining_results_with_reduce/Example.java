package acme.study_guide.chapter07.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_reduce;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("", (c, s1) -> c + s1,
                        (s2, s3) -> s2 + s3));
    }
}
