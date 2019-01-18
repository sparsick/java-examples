package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.Instant;

public class InstantExample {

    public static void main(String... args) {
        Instant ofEpochMilli = Instant.ofEpochMilli(1000);
        Instant ofEpochSecond = Instant.ofEpochSecond(100);
        Instant now = Instant.now();
    }
}
