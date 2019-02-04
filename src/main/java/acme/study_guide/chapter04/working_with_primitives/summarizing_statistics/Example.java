package acme.study_guide.chapter04.working_with_primitives.summarizing_statistics;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);
        System.out.println(range(stream));
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
}
