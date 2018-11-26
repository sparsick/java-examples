package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarYellowColorPredicateTest {

    @Test
    void carIsYellow() {
        Car car = new Car("Bob, der Baumeister", "yellow", 120);

        CarYellowColorPredicate predicateUnderTest = new CarYellowColorPredicate();
        boolean result = predicateUnderTest.test(car);

        assertTrue(result);
    }

    @Test
    void carIsNotYellow() {
        Car car = new Car("Lukas, der Lokomotiveführer", "blue", 250);

        CarYellowColorPredicate predicateUnderTest = new CarYellowColorPredicate();
        boolean result = predicateUnderTest.test(car);

        assertFalse(result);
    }
}