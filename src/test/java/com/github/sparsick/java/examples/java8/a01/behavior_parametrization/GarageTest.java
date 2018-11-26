package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GarageTest {

    @Test
    void filterYellowCarPreJava8Style(){
        Car expectedYellowCar = new Car("Bob, der Baumeister", "yellow", 120);

        Garage garage = new Garage();
        garage.addCar(expectedYellowCar);
        garage.addCar(new Car("Lukas, der Lokomotivführer", "blue", 250));

        Set<Car> yellowCars = garage.filterYellowCarsPreJava8Style();

        assertThat(yellowCars).hasSize(1).contains(expectedYellowCar);
    }

}