package acme.tests.chapter17.test33;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2017, 12, 25);
        LocalDate blackFriday = LocalDate.of(2017, 11, 24);
//        long shoppingDaysLeft = blackFriday.until(xmas, ChronoUnit.DAYS);
        long shoppingDaysLeft = ChronoUnit.DAYS.between(blackFriday, xmas);
        System.out.println(shoppingDaysLeft);
    }
}
