package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GarageTest {

    @Test
    void filterYellowCarPreJava8Style() {
        Car expectedYellowCar = new Car("Bob, der Baumeister", "yellow", 120);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedYellowCar);
        garageUnderTest.addCar(new Car("Lukas, der Lokomotivführer", "blue", 250));

        Set<Car> yellowCars = garageUnderTest.filterYellowCarsPreJava8Style();

        assertThat(yellowCars).hasSize(1).contains(expectedYellowCar);
    }

    @Test
    void filterCarByColorPreJava8Style() {
        Car expectedYellowCar = new Car("Bob, der Baumeister", "yellow", 120);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedYellowCar);
        garageUnderTest.addCar(new Car("Lukas, der Lokomotivführer", "blue", 250));

        Set<Car> yellowCars = garageUnderTest.filterCarsByColorPreJava8Style("yellow");

        assertThat(yellowCars).hasSize(1).contains(expectedYellowCar);
    }

    @Test
    void filterCarPreJava8Style() {
        Car expectedCarOfBob = new Car("Bob, der Baumeister", "yellow", 120);
        Car expectedCarOfLukas = new Car("Lukas, der Lokomotivführer", "blue", 250);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedCarOfBob);
        garageUnderTest.addCar(expectedCarOfLukas);
        garageUnderTest.addCar(new Car("Der kleine Prinz", "white", 500));

        Set<Car> yellowCars = garageUnderTest.filterCarsPreJava8Style("blue", 120);

        assertThat(yellowCars).hasSize(2).contains(expectedCarOfBob, expectedCarOfLukas);
    }

    @Test
    void filterCarByPredicatePreJava8Style() {
        Car expectedCar = new Car("Bob, der Baumeister", "yellow", 120);
        CarPredicate carPredicateMock = mock(CarPredicate.class);
        when(carPredicateMock.test(expectedCar)).thenReturn(true);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedCar);

        Set<Car> cars = garageUnderTest.filterCarsPreJava8Style(carPredicateMock);
        assertThat(cars).hasSize(1).contains(expectedCar);
    }

    @Test
    void filterCarByCarYellowPredicatePreJava8Style() {
        Car expectedCar = new Car("Bob, der Baumeister", "yellow", 120);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedCar);

        Set<Car> cars = garageUnderTest.filterCarsPreJava8Style(new CarYellowColorPredicate());
        assertThat(cars).hasSize(1).contains(expectedCar);
    }

    @Test
    void filterCarByCarAnonymePredicatePreJava8Style() {
        Car expectedCarOfBob = new Car("Bob, der Baumeister", "yellow", 120);
        Car expectedCarOfLukas = new Car("Lukas, der Lokomotivführer", "blue", 250);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedCarOfBob);
        garageUnderTest.addCar(expectedCarOfLukas);
        garageUnderTest.addCar(new Car("Der kleine Prinz", "white", 500));

        Set<Car> yellowCars = garageUnderTest.filterCarsPreJava8Style(new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return "blue".equals(car.getColor()) || car.getHorsePower() <= 120;
            }
        });

        assertThat(yellowCars).hasSize(2).contains(expectedCarOfBob, expectedCarOfLukas);
    }

    @Test
    void filterCarByCarAnonymePredicateJava8Style() {
        Car expectedCarOfBob = new Car("Bob, der Baumeister", "yellow", 120);
        Car expectedCarOfLukas = new Car("Lukas, der Lokomotivführer", "blue", 250);

        Garage garageUnderTest = new Garage();
        garageUnderTest.addCar(expectedCarOfBob);
        garageUnderTest.addCar(expectedCarOfLukas);
        garageUnderTest.addCar(new Car("Der kleine Prinz", "white", 500));

        Set<Car> yellowCars = garageUnderTest.filterCarsPreJava8Style(car -> "blue".equals(car.getColor()) || car.getHorsePower() <= 120);

        assertThat(yellowCars).hasSize(2).contains(expectedCarOfBob, expectedCarOfLukas);
    }




}