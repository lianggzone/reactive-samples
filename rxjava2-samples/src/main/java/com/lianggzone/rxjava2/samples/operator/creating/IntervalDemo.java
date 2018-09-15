package com.lianggzone.rxjava2.samples.operator.creating;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class IntervalDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.interval(1, TimeUnit.SECONDS)
            .subscribe(System.out::println);

        TimeUnit.MINUTES.sleep(1L);
    }
}
