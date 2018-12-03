package com.github.sparsick.java.examples.java8.a04.method.reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

    private void constructurReference(Supplier<Car> supplier) {
        Car car = supplier.get();
        car.run();

    }

    private void constructurReference(Function<Integer, Car> function) {
        Car car = function.apply(10);
        car.run();
    }

    public static void main(String... args) {
        MethodReference methodReference = new MethodReference();

        Supplier<Car> supplier = () -> new Car();
        //        Supplier<Car> supplier = Car::new;

        methodReference.constructurReference(supplier);

        Function<Integer, Car> function = (horsepower) -> new Car(horsepower);
//        Function<Integer, Car> function = Car::new;

        methodReference.constructurReference(function);

    }


}
