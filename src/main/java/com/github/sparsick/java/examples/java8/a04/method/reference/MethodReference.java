package com.github.sparsick.java.examples.java8.a04.method.reference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;

public class MethodReference {

    private void staticMethod(Consumer<String> consumer){
        consumer.accept("     Hello World   ");
    }

    private void instanceMethod(CarFunctionalInterface carFunctionalInterface){
        String name = carFunctionalInterface.run(new Car(), "Bob");
        System.out.println(name);
    }

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

        Consumer<String> consumer = (name) -> StringUtils.trim(name);
//        Consumer<String> consumer = StringUtils::trim;
        methodReference.staticMethod(consumer);

        CarFunctionalInterface carFunctionalInterface = (car, name) -> car.createName(name);
//        CarFunctionalInterface carFunctionalInterface = Car::createName;
        methodReference.instanceMethod(carFunctionalInterface);

        Car car = new Car();

        Consumer<String> consumer1 = (name) -> car.createName(name);
//        Consumer<String> consumer1 = car::createName;

        Supplier<Car> supplier = () -> new Car();
        //        Supplier<Car> supplier = Car::new;
        methodReference.constructurReference(supplier);

        Function<Integer, Car> function = (horsepower) -> new Car(horsepower);
//        Function<Integer, Car> function = Car::new;
        methodReference.constructurReference(function);

    }


}
