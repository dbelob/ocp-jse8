package acme.tests.chapter17.test30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PolarBear {
    public static void main(String[] args) {
        LocalDate polarBearDay = LocalDate.of(2017, 2, 27);
        DateTimeFormatter formatter = DateTimeFormatter
//                .ofPattern("Holiday: yyyy dd MMM");
                .ofPattern("yyyy dd MMM");
        System.out.println(polarBearDay.format(formatter));
    }
}
