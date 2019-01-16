package com.github.sparsick.java.examples.java8.a09.optional;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String... args) {
        // Creating Optional objects
        Optional<Car> optionalCar= Optional.empty();


        Car car = new Car("brown", 100, null);
        Optional<Car> optionalCar1 = Optional.of(car);

        Car nullableCar = null;
        Optional<Car> optionalCar2 = Optional.ofNullable(nullableCar);

        // Extracting and transforming values
        Optional<String> optionalColour = optionalCar2.map(Car::getColour);

        //Chaining Optional objects
        Car car1 = new Car("blue", 120, new Driver("Mario", "Brothers"));
        Optional<Car> optionalCar3 = Optional.of(car1);
        Optional<String> optionalDriverLastName = optionalCar3.map(Car::getDriver).map(Driver::getLastName);
        String driverLastName = optionalDriverLastName.orElse("UNKOWN");


    }
}
