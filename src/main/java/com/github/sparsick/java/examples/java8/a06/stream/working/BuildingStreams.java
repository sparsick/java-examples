package com.github.sparsick.java.examples.java8.a06.stream.working;

import java.util.Arrays;
import java.util.stream.Stream;

public class BuildingStreams {

    void streamFromValues(){
        Stream.of("Hello", "World");
        Stream.of(new Car("yellow", 50), new Car("blue", 100));
    }

    void streamFromArrays(){
        Arrays.stream(new int[] {1,2,3});
    }

    void streamOfFunction(){
        Stream.iterate(0, n -> n + 2).limit(10);
    }
}
