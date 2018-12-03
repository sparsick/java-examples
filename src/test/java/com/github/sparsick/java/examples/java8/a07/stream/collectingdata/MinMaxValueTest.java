package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Optional;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinMaxValueTest {
    private MinMaxValue minMaxValueUnderTest = new MinMaxValue();

    @Test
    void minimum() {
        Optional<Car> optionalCar = minMaxValueUnderTest.carWithTheMinimumHorsePower();

        assertThat(optionalCar.isPresent()).isTrue();
        assertThat(optionalCar.get()).isEqualTo(new Car("yellow", 80));
    }

    @Test
    void maximum() {
        Optional<Car> optionalCar = minMaxValueUnderTest.carWithTheMaximumHorsePower();

        assertThat(optionalCar.isPresent()).isTrue();
        assertThat(optionalCar.get()).isEqualTo(new Car("red", 200));
    }
}