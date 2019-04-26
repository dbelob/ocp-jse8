package acme.tests.chapter17.test17;

import java.time.Duration;
import java.time.Period;

public class Example {
    public static void main(String[] args) {
        Duration duration = Duration.ofDays(1);
        Period period = Period.ofDays(1);

        System.out.println("duration: " + duration);
        System.out.println("period: " + period);
    }
}
