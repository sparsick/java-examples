package com.github.sparsick.java.examples.java8.a05.stream.imperativvsdeclarative;

import java.util.Objects;

public class Car {

    private String colour;
    private int horsePower;

    public Car(String colour, int horsePower) {
        this.colour = colour;
        this.horsePower = horsePower;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return Objects.equals(colour, car.colour) &&
                Objects.equals(horsePower, car.horsePower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", horsePower='" + horsePower + '\'' +
                '}';
    }
}
