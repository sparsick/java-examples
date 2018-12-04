package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Grouping {
    private final List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120, CarType.VAN, FuelType.DIESEL),
            new Car("red", 200, CarType.SPORT, FuelType.DIESEL));

    Map<CarType, List<Car>> carByCarType(){
        return cars.stream().collect(groupingBy(Car::getCarType));
    }

    Map<FuelType, Map<CarType, List<Car>>> multilevelGrouping(){
        return cars.stream().collect(groupingBy(Car::getFuelType, groupingBy(Car::getCarType)));
    }

    public static void main(String... args) {
        Grouping grouping = new Grouping();

        Map<CarType, List<Car>> carByType = grouping.carByCarType();
        System.out.println(carByType);

        Map<FuelType, Map<CarType, List<Car>>> multilevelGrouping = grouping.multilevelGrouping();
        System.out.println(multilevelGrouping);
    }

}
