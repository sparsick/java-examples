package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class FindingAndMatching {

    private final List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));

    boolean anyMatch() {
        return cars.stream().anyMatch(car -> car.getHorsePower() < 150);
    }

    boolean allMatch() {
        return cars.stream().allMatch(car -> car.getHorsePower() > 50);
    }

    boolean noneMatch() {
        return cars.stream().noneMatch(car -> car.getHorsePower() > 300);
    }

    public Optional<Car> findAny() {
        return cars.stream().filter(car -> car.getHorsePower() < 150).findAny();
    }

    public Optional<Car> findFirst() {
        return cars.stream().filter(car -> car.getHorsePower() < 150).findFirst();
    }
}
