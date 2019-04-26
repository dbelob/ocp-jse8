package acme.tests.chapter17.test36;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example {
    public static void main(String[] args) {
        isItMyBirthday(LocalDateTime.now());
    }

    public static boolean isItMyBirthday(LocalDateTime dateTime) {
        LocalDate now = LocalDate.now();

        return now.getMonth() == dateTime.getMonth()
                && now.getDayOfMonth() == dateTime.getDayOfMonth();
    }
}
