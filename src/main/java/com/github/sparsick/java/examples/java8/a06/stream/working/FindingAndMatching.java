package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Optional;
import java.util.stream.Stream;

class FindingAndMatching {

    private final Stream<Car> cars = Stream.of(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));

    boolean anyMatch() {
        return cars.anyMatch(car -> car.getHorsePower() < 150);
    }

    boolean allMatch() {
        return cars.allMatch(car -> car.getHorsePower() > 50);
    }

    boolean noneMatch() {
        return cars.noneMatch(car -> car.getHorsePower() > 300);
    }

    public Optional<Car> findAny() {
        return cars.filter(car -> car.getHorsePower() < 150).findAny();
    }

    public Optional<Car> findFirst() {
        return cars.filter(car -> car.getHorsePower() < 150).findFirst();
    }
}
