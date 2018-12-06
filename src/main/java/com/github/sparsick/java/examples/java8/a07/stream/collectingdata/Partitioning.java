package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

    private final List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120, CarType.VAN, FuelType.DIESEL),
            new Car("red", 200, CarType.SPORT, FuelType.DIESEL));

    Map<Boolean, List<Car>> partitioning(){
        return cars.stream().collect(Collectors.partitioningBy(cars -> cars.getHorsePower() < 110));
    }

    public static void main (String... args) {
        Map<Boolean, List<Car>> partitioning = new Partitioning().partitioning();

        System.out.println(partitioning);
    }
}
