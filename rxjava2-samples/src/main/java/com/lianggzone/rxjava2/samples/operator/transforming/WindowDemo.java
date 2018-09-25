package com.lianggzone.rxjava2.samples.operator.transforming;

import io.reactivex.Observable;

public class WindowDemo {
    public static void main(String[] args) {
        Observable.range(1, 10).window(3).subscribe(observable -> {
            System.out.println("=====");
            observable.subscribe(System.out::println);
        });
    }
}
