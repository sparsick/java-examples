package com.github.sparsick.java.examples.java8.a01.behavior_parametrization;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Garage {

    private Set<Car> cars = new HashSet<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    // first requirement: filter by yellow car
    public Set<Car> filterYellowCarsPreJava8Style() {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if("yellow".equals(car.getColor())){
                result.add(car);
            }
        }
        return result;
    }

    // second requirement: filter cars by color
    public Set<Car> filterCarsByColorPreJava8Style(String color) {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if(color.equals(car.getColor())){
                result.add(car);
            }
        }
        return result;
    }


    // third requirement: filter cars by any attribute
    public Set<Car> filterCarsPreJava8Style(String color, int maxHorsePower) {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if(color.equals(car.getColor()) || car.getHorsePower() <= maxHorsePower){
                result.add(car);
            }
        }
        return result;
    }

    // fourth requirement: flexible filter mechanismn
    public Set<Car> filterCarsPreJava8Style(CarPredicate carFilter) {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if(carFilter.test(car)){
                result.add(car);
            }
        }
        return result;
    }

    // fifth requirement: flexible filter mechanismn with lambda
    public Set<Car> filterCarsJava8Style(Predicate carFilter) {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if(carFilter.test(car)){
                result.add(car);
            }
        }
        return result;
    }
}
