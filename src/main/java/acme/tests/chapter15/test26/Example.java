package acme.tests.chapter15.test26;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class Example {
    public static void main(String[] args) {
        LongStream stream = LongStream.of(6, 10);
        LongSummaryStatistics stats = stream.summaryStatistics();
        System.out.println(stats.getAverage());
    }
}
