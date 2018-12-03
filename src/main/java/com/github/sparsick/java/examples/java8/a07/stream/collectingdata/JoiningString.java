package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningString {
    private final List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));


    String allColour() {
        return cars.stream().map(Car::getColour).collect(Collectors.joining());
    }


    String allColourBeautify() {
        return cars.stream().map(Car::getColour).collect(Collectors.joining(", "));
    }

    public static void main(String... args) {
        JoiningString joiningString = new JoiningString();

        String allColour = joiningString.allColour();
        System.out.println(allColour);

        String allColourBeautify = joiningString.allColourBeautify();
        System.out.println(allColourBeautify);
    }


}
