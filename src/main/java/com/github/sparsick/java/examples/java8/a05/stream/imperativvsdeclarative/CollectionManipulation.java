package com.github.sparsick.java.examples.java8.a05.stream.imperativvsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionManipulation {

    public static void main(String... args) {
        List<Car> cars = Arrays.asList(new Car("blue", 300),
                new Car("yellow", 150),
                new Car("green", 100),
                new Car("red", 80));

        List<Car> filteredCarsPreJava8Style = preJava8Style(cars);
        System.out.println(filteredCarsPreJava8Style);
        List<Car> filteredCarsJava8Style = java8Style(cars);
        System.out.println(filteredCarsJava8Style);
    }


    private static List<Car> preJava8Style(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getHorsePower() < 200 && filteredCars.size() < 2) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    private static List<Car> java8Style(List<Car> cars) {
        List<Car> carList = cars.stream()
                .filter(car -> car.getHorsePower() < 200)
                .limit(2)
                .collect(Collectors.toList());
        return carList;
    }
}
