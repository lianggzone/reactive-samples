package com.lianggzone.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {

    public static void main(String[] args) {
        apply("liang#gzone", System.out::println);
    }

    public static void apply(String str, Consumer<String> c) {
        c.accept(str + "@Liang");
    }

}
