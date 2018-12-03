package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.stream.Stream;

class Reducing {

    private Stream<Car> cars = Stream.of(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));


    int reduce() {
        return cars.map(car -> car.getHorsePower())
                .reduce(0, (horsepower, sum) -> sum + horsepower);
    }

    long count() {
        return cars.filter(car -> car.getHorsePower() < 150).count();
    }
}
