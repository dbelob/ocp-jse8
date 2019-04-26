package acme.tests.chapter17.test37;

import java.time.LocalDate;
import java.time.Month;

public class Example {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
        LocalDate date2 = date1.plusDays(2).minusDays(1).minusDays(1);
        System.out.println(date1.equals(date2));
    }
}
