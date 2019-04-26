package acme.tests.chapter17.test23;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
//        DateFormatter f = DateFormatter.ISO_DATE;
        DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
        System.out.println(hatDay.format(f));
    }
}
