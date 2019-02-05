package acme.study_guide.chapter05.working_with_durations;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);
        System.out.println(date.plus(period)); // 2015–05–26
        System.out.println(date.plus(days)); // Unsupported unit: Seconds
    }
}
