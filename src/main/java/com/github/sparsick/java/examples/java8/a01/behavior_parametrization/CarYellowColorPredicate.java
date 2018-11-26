package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

public class CarYellowColorPredicate implements CarPredicate {
    @Override
    public boolean test(Car car) {
        return "yellow".equals(car.getColor());
    }
}
