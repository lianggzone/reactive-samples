package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class AmbDemo {
    public static void main(String[] args) {
        Observable.ambArray(
            Observable.range(0, 10).delay(1, TimeUnit.SECONDS),
            Observable.range(100, 10))
            .subscribe(System.out::println);
    }
}
