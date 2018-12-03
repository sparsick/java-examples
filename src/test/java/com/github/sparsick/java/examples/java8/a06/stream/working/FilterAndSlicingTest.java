package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.List;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FilterAndSlicingTest {

    private final Condition<Car> max150HorsePower = new Condition<>(car -> car.getHorsePower() < 150, "max. 150 horsepower");

    private FilterAndSlicing filterAndSlicingUnderTest = new FilterAndSlicing();

    @Test
    void filterWithPredicate() {
        List<Car> cars = filterAndSlicingUnderTest.filterWithPredicate();

        assertThat(cars).hasSize(3)
                .contains(new Car("yellow", 80),
                            new Car("blue", 100),
                            new Car("green", 120));
    }

    @Test
    void filterUniqueElements(){
        List<Integer> integerList = filterAndSlicingUnderTest.filterUniqueElement();

        assertThat(integerList).contains(2,4);
    }

    @Test
    void truncating(){
        List<Car> cars = filterAndSlicingUnderTest.truncating();

        assertThat(cars).hasSize(2)
                        .have(max150HorsePower)
                        .contains(new Car("yellow", 80),
                                  new Car("blue", 100));
    }

    @Test
    void skipping(){
        List<Car> cars = filterAndSlicingUnderTest.skipping();

        assertThat(cars).hasSize(1)
                .have(max150HorsePower)
                .contains(new Car("green", 120));
    }



}