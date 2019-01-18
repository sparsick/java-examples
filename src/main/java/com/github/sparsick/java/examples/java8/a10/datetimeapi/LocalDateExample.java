package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

class LocalDateExample {

    public static void main (String... args) {
        LocalDate date = LocalDate.of(2019, 11, 9);
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int lengthOfMonth = date.lengthOfMonth();
        boolean isLeapYear = date.isLeapYear();
        LocalDate today = LocalDate.now();

        LocalDate date1 = LocalDate.parse("2019-11-09");

        // date manipulation
        LocalDate date2 = LocalDate.of(2019, 10,1);
        LocalDate date3 = date2.with(ChronoField.DAY_OF_YEAR, 10);
        LocalDate date4 = date3.withYear(2018);

        // date calculation
        LocalDate date5 = date2.plusDays(3);
        LocalDate date6 = date2.plus(3, ChronoUnit.MONTHS);

    }
}
