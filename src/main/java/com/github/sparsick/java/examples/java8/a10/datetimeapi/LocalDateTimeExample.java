package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String... args) {
        LocalDateTime localDateTime = LocalDateTime.of(2019, Month.NOVEMBER, 9, 13, 34, 20);
        LocalDate date = LocalDate.of(2019, 11, 20);
        LocalTime time = LocalTime.of(13, 20, 34);
        LocalDateTime localDateTime1 = LocalDateTime.of(date, time);
        LocalDateTime localDateTime2 = date.atTime(time);
        LocalDateTime localDateTime3 = time.atDate(date);

        LocalDate date1 = localDateTime.toLocalDate();
        LocalTime time1 = localDateTime.toLocalTime();
    }
}
