package com.github.sparsick.java.examples.java8.a09.optional;

import java.util.Objects;

public class Car {

    private String colour;
    private int horsePower;
    private Driver driver;

    public Car(String colour, int horsePower, Driver driver) {
        this.colour = colour;
        this.horsePower = horsePower;
        this.driver = driver;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return horsePower == car.horsePower &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, horsePower, driver);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", horsePower=" + horsePower +
                ", driver=" + driver +
                '}';
    }
}
