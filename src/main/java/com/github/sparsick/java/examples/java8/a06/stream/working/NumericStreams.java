package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Arrays;
import java.util.List;

public class NumericStreams {

    private List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));


    int mappingToNumericStream(){
        return cars.stream()                          // Stream<Car>
                .mapToInt(car -> car.getHorsePower()) // IntStream
                .sum();
    }
}
