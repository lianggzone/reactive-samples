package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class SkipUtilDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.intervalRange(0, 10,0, 1, TimeUnit.SECONDS)
            .skipUntil(Observable.timer(3, TimeUnit.SECONDS))
            .subscribe(System.out::println);

        Thread.sleep(10000L);
    }
}
