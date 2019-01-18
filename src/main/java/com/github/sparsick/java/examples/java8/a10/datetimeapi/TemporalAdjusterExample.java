package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {

    public static void main(String... args) {
        LocalDate date = LocalDate.of(2019, 11, 10);
        LocalDate date1 = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        LocalDate date2 = date.with(TemporalAdjusters.firstDayOfNextYear());
    }
}
