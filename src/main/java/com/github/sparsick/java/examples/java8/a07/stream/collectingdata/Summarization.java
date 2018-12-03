package com.github.sparsick.java.examples.java8.a07.stream.collectingdata;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.reducing;

public class Summarization {

    private final List<Car> cars = Arrays.asList(new Car("yellow", 80),
            new Car("blue", 100),
            new Car("green", 120),
            new Car("red", 200));

    int sumOfHorsePower(){
        return cars.stream().collect(Collectors.summingInt(Car::getHorsePower));
    }

    double averageHorsePower(){
        return cars.stream().collect(Collectors.averagingInt(Car::getHorsePower));
    }

    IntSummaryStatistics horsePowerStatistics(){
        return cars.stream().collect(Collectors.summarizingInt(Car::getHorsePower));
    }

    int sumOfHorsePowerReduction(){
        return cars.stream().collect(reducing(0, Car::getHorsePower, Integer::sum));
    }

    public static void main(String... args){
        Summarization summarization = new Summarization();

        IntSummaryStatistics intSummaryStatistics = summarization.horsePowerStatistics();
        System.out.println(intSummaryStatistics);

        int sumOfHorsePowerReduction = summarization.sumOfHorsePowerReduction();
        System.out.println(sumOfHorsePowerReduction);
    }
}
