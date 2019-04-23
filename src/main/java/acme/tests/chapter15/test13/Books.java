package acme.tests.chapter15.test13;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Books {
    public static void main(String[] args) {
        IntStream pages = IntStream.of(200, 300);
        IntSummaryStatistics stats = pages.summaryStatistics();
        long total = stats.getSum();
        long count = stats.getCount();
        System.out.println(total + "-" + count);
    }
}
