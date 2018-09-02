package com.lianggzone.lambdas;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        requireNonNull(null, () -> "null");
    }

    public static <T> void requireNonNull(T obj, Supplier<String> messageSupplier) {
        if (obj == null){
            System.out.println(messageSupplier.get());
        }
    }
}
