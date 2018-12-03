package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Mapping {

    List<String> map() {
        List<Car> cars = Arrays.asList(new Car("yellow", 80),
                new Car("blue", 100),
                new Car("green", 120),
                new Car("red", 200));

        return cars.stream().map(car -> car.getColour())
                .collect(toList());
    }

    List<String> flatMap(){
        String[] wordArray = {"Nice", "car" };

        return Arrays.stream(wordArray).map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .collect(toList());
    }
}
