package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.stream.Stream;

class NumericStreams {

    private Stream<Car> cars = Stream.of(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));


    int mappingToNumericStream() {
        return cars                                   // Stream<Car>
                .mapToInt(car -> car.getHorsePower()) // IntStream
                .sum();
    }
}
