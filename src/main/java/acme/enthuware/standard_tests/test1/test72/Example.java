package acme.enthuware.standard_tests.test1.test72;

import java.time.*;

// What will the following code print ?
public class Example {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}
// A.
// 2015-11-01T09:00-05:00[US/Eastern]
// 2015-11-01T09:00-05:00[US/Eastern]
//
// B.
// 2015-11-01T09:00-05:00[US/Eastern]
// 2015-11-01T10:00-05:00[US/Eastern]
//
// C.
// 2015-11-01T10:00-05:00[US/Eastern]
// 2015-11-01T09:00-05:00[US/Eastern]
//
// D.
// 2015-11-01T10:00-05:00[US/Eastern]
// 2015-11-01T10:00-05:00[US/Eastern]
