package com.lianggzone.rxjava2.samples.operator.filtering;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TakeDemo {
    public static void main(String[] args) throws InterruptedException {
        // Observable.range(1, 8).take(2).subscribe(System.out::println);

        // Observable.range(1, 100).take(3, TimeUnit.SECONDS).subscribe(System.out::println);

        Observable.intervalRange(1, 100, 1, 1, TimeUnit.SECONDS).take(2).subscribe(System.out::println);

        Thread.sleep(10000L);
    }
}
