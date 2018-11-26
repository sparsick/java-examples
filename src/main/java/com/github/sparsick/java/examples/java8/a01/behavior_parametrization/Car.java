package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

import java.util.Objects;

public class Car {

    private String owner;
    private String color;
    private int horsePower;

    public Car(String owner, String color, int horsePower) {
        this.owner = owner;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return horsePower == car.horsePower &&
                owner.equals(car.owner) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, color, horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
