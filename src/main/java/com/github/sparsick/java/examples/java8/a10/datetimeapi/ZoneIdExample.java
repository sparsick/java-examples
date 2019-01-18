package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {
    public static void main(String... args) {
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZoneId berlinZone = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt1 = date.atStartOfDay(berlinZone);
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(berlinZone);
        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(berlinZone);

    }

}
