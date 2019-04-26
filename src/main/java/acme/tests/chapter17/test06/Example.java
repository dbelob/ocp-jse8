package acme.tests.chapter17.test06;

import java.time.LocalDate;

public class Example {
    public static void main(String[] args) {
        int year = 1874;
//        int month = Month.MARCH;
        int month = 3;
        int day = 24;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.isBefore(LocalDate.now()));
    }
}
