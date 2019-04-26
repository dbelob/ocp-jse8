package acme.tests.chapter17.test38;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 5, 13);
        LocalTime time = LocalTime.of(10, 0);
        LocalDateTime trainDay = LocalDateTime.of(date, time);
//        Instant instant = trainDay.toInstant();
        Instant instant = trainDay.toInstant(ZoneOffset.of("-07"));
        instant = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(instant);
    }
}
