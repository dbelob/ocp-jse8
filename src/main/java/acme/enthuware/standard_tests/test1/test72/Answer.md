# Explanation

B.

Important thing to remember here is that Period is used to manipulate dates in terms of days, months, and years, while Duration is used to manipulate dates in terms of hours, minutes, and seconds. Therefore, Period doesn't mess with the time component of the date while Duration may change the time component if the date is close to the DST  boundary.

Durations and periods differ in their treatment of daylight savings time when added to ZonedDateTime. A Duration will add an exact number of seconds, thus a duration of one day is always exactly 24 hours. By contrast, a Period will add a conceptual day, trying to maintain the local time.

For example, consider adding a period of one day and a duration of one day to 18:00 on the evening before a daylight savings gap. The Period will add the conceptual day and result in a ZonedDateTime at 18:00 the following day. By contrast, the Duration will add exactly 24 hours, resulting in a ZonedDateTime at 19:00 the following day (assuming a one hour DST gap).
