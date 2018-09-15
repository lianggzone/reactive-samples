package com.lianggzone.lambdas;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        boolean b = contains("liang#gzone", s -> s.contains("liang"));
        System.out.println(b);

    }

    public static boolean contains(String str, Predicate<String> p) {
        return p.test(str);
    }
}
