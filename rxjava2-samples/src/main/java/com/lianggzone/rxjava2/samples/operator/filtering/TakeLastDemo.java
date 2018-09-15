package com.lianggzone.rxjava2.samples.operator.filtering;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TakeLastDemo {
    public static void main(String[] args) {
        Observable.range(1, 8).takeLast(2).subscribe(System.out::println);

        Observable.range(1, 100).takeLast(3, TimeUnit.SECONDS).subscribe(System.out::println);
    }
}
