package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Objects;

public class Car {
    private String colour;
    private int horsePower;
    private CarType carType;
    private FuelType fuelType;

    public Car(String colour, int horsePower) {
        this(colour,horsePower, CarType.NORMAL, FuelType.GAS);
    }

    public Car(String colour, int horsePower, CarType carType, FuelType fuelType) {
        this.colour = colour;
        this.horsePower = horsePower;
        this.carType = carType;
        this.fuelType = fuelType;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public CarType getCarType() {
        return carType;
    }

    public FuelType getFuelType() {
        return fuelType;
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
                carType == car.carType &&
                fuelType == car.fuelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, horsePower, carType, fuelType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", horsePower=" + horsePower +
                ", carType=" + carType +
                ", fuelType=" + fuelType +
                '}';
    }
}
