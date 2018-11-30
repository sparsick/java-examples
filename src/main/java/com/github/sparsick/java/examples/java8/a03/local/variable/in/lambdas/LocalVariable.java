package com.github.sparsick.java.examples.java8.a03.local.variable.in.lambdas;

public class LocalVariable {

    void demo(Runnable runnable) {
        runnable.run();
    }

    public static void main(String... args) {
        String output = "Hello World";

        LocalVariable localVariable = new LocalVariable();
        localVariable.demo(() -> System.out.println(output));

        //        output = "Bye World";
    }
}
