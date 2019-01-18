package com.github.sparsick.java.examples.java8.a10.datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class DateParsingExample {

    public static void main(String... args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);

        // pre-defined formatter
        LocalDate parsedDate1 = LocalDate.parse(text, DateTimeFormatter.ISO_DATE_TIME);

        // localized formatter
        DateTimeFormatter italianFormatter =
                DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        String formattedDate = date.format(italianFormatter); // 18. März 2014
        LocalDate date2 = LocalDate.parse(formattedDate, italianFormatter);

        // builder
        DateTimeFormatter customFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter();


    }
}
