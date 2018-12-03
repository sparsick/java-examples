package com.github.sparsick.java.examples.java8.a04.method.reference;

class Car {

    private int horsepower;

    Car(int horsepower) {

        this.horsepower = horsepower;
    }

    Car() {
    }

    void run(){
        System.out.println(String.format("Run car with %s horsepower!", Integer.toString(horsepower)));
    }

    public String createName(String name) {
        return String.format("Car: %s", name);
    }
}
