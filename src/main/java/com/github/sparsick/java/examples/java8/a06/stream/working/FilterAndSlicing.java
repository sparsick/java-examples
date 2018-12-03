package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class FilterAndSlicing {

    List<Car> filterWithPredicate() {
        List<Car> cars = Arrays.asList(new Car("yellow", 80),
                new Car("blue", 100),
                new Car("green", 120),
                new Car("red", 200));
        return cars.stream().filter(car -> car.getHorsePower() < 150).collect(toList());
    }

    List<Integer> filterUniqueElement(){
        List<Integer> numbers = Arrays.asList(1,1,2,2,3,3,4,4);

        return numbers.stream().filter(i -> i % 2 == 0)
                                .distinct()
                                .collect(toList());
    }

    List<Car> truncating(){
        List<Car> cars = Arrays.asList(new Car("yellow", 80),
                new Car("blue", 100),
                new Car("green", 120),
                new Car("red", 200));
        return cars.stream().filter(car -> car.getHorsePower() < 150)
                            .limit(2)
                            .collect(toList());
    }

    List<Car> skipping(){
        List<Car> cars = Arrays.asList(new Car("yellow", 80),
                new Car("blue", 100),
                new Car("green", 120),
                new Car("red", 200));
        return cars.stream().filter(car -> car.getHorsePower() < 150)
                .skip(2)
                .collect(toList());
    }


}
