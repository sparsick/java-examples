package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

class MinMaxValue {


    private final List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));

    Optional<Car> carWithTheMinimumHorsePower() {
        return cars.stream().collect(minBy(Comparator.comparingInt(Car::getHorsePower)));
    }

    Optional<Car> carWithTheMinimumHorsePower2() {
        return cars.stream().min(Comparator.comparingInt(Car::getHorsePower));
    }

    Optional<Car> carWithTheMaximumHorsePower() {
        return cars.stream().collect(maxBy(Comparator.comparingInt(Car::getHorsePower)));
    }

    Optional<Car> carWithTheMaximumHorsePower2() {
        return cars.stream().max(Comparator.comparingInt(Car::getHorsePower));
    }
}
