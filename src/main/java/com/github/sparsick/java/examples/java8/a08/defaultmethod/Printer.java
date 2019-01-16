package com.github.sparsick.java.examples.java8.a08.defaultmethod;

public class Printer implements InterfaceWithDefaultMethod {
    @Override
    public void print(String message) {
        System.out.print(message);
    }

    public static void main(String ... args) {
        InterfaceWithDefaultMethod.message();

        Printer printer = new Printer();
        printer.println("Hello World");
        printer.print("Hallo Welt");
    }
}
