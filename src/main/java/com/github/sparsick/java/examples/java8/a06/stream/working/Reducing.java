package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Arrays;
import java.util.List;

public class Reducing {

    private List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));


    int reduce(){
        return cars.stream().map(car -> car.getHorsePower())
                            .reduce(0, (horsepower, sum) -> sum + horsepower);
    }

    long count() {
        return cars.stream().filter(car -> car.getHorsePower() < 150).count();
    }
}
