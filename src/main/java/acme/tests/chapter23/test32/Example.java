package acme.tests.chapter23.test32;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String[] args) {
        LocalDate trainDay = LocalDate.of(2017, 5, 13);
        LocalTime time = LocalTime.of(10, 0);
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.of(trainDay, time, zone);
        Instant instant = zdt.toInstant();
        instant = instant.plus(1, ChronoUnit.YEARS);
        System.out.println(instant);
    }
}
