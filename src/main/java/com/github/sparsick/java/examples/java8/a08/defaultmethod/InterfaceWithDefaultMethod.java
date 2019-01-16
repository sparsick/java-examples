package com.github.sparsick.java.examples.java8.a08.defaultmethod;

public interface InterfaceWithDefaultMethod {

    static void message(){
        System.out.print(":)");
    }

    default void println(String message) {
        System.out.println(message);
    }

    void print(String message);
}
