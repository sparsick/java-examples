package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main (String... args) {
        LocalTime time = LocalTime.of(13, 34, 3); // 13:34:03
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        LocalTime time2 = LocalTime.parse("13:34:03");
    }
}
