package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class DurationPeriodExample {

    public static void main (String... args) {
        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = Instant.now();
        Duration duration = Duration.between(temporal1, temporal2);

        Period period = Period.of(3,2,1);
    }
}
