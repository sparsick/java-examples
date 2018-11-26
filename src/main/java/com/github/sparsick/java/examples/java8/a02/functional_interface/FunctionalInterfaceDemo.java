package com.github.sparsick.java.examples.java8.a02.functional_interface;

public class FunctionalInterfaceDemo {

    public void demo(FunctionalInterface demo){
        demo.aMethod();
    }

    public static void main(String... args) {
        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();

        demo.demo(() -> System.out.println("Hello World"));
    }

}
