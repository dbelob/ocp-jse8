package acme.enthuware.standard_tests.test5.test12;

import java.time.Duration;
import java.time.Period;

public class Example {
    public static void main(String[] args) {
        Duration d = Duration.ofDays(1);
        System.out.println(d);
        d = Duration.ofMinutes(0);
        System.out.println(d);
        Period p = Period.ofMonths(0);
        System.out.println(p);
    }
}
