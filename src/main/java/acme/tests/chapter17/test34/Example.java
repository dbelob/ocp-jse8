package acme.tests.chapter17.test34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example {
    public static void main(String[] args) {
        formatMe(LocalDate.now());
    }

    private static String formatMe(LocalDate obj) {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        return f.format(obj);
    }
}
