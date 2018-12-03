package com.github.sparsick.java.examples.java8.a06.stream.working;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReducingTest {

    private Reducing reducingUnderTest = new Reducing();

    @Test
    void reduce() {
        int sumOfHorsePower = reducingUnderTest.reduce();

        assertThat(sumOfHorsePower).isEqualTo(500);
    }

    @Test
    void count() {
        long sumOfCars = reducingUnderTest.count();

        assertThat(sumOfCars).isEqualTo(3);
    }
}