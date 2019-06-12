package acme.enthuware.standard_tests.test5.test86;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String args[]) {
        Instant now = Instant.now();
        Instant now2 = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(now2);
    }
}
