package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GarageTest {

    @Test
    void filterYellowCarPreJava8Style(){
        Car expectedYellowCar = new Car("Bob, der Baumeister", "yellow", 120);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedYellowCar);
        garageUnderTest.addCar(new Car("Lukas, der Lokomotivführer", "blue", 250));

        Set<Car> yellowCars = garageUnderTest.filterYellowCarsPreJava8Style();

        assertThat(yellowCars).hasSize(1).contains(expectedYellowCar);
    }

    @Test
    void filterCarByColorPreJava8Style(){
        Car expectedYellowCar = new Car("Bob, der Baumeister", "yellow", 120);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedYellowCar);
        garageUnderTest.addCar(new Car("Lukas, der Lokomotivführer", "blue", 250));

        Set<Car> yellowCars = garageUnderTest.filterCarsByColorPreJava8Style("yellow");

        assertThat(yellowCars).hasSize(1).contains(expectedYellowCar);
    }

    @Test
    void filterCarPreJava8Style(){
        Car expectedCarOfBob = new Car("Bob, der Baumeister", "yellow", 120);
        Car expectedCarOfLukas = new Car("Lukas, der Lokomotivführer", "blue", 250);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedCarOfBob);
        garageUnderTest.addCar(expectedCarOfLukas);
        garageUnderTest.addCar(new Car("Der kleine Prinz", "white", 500));

        Set<Car> yellowCars = garageUnderTest.filterCarsPreJava8Style("blue", 120);

        assertThat(yellowCars).hasSize(2).contains(expectedCarOfBob, expectedCarOfLukas);
    }


}