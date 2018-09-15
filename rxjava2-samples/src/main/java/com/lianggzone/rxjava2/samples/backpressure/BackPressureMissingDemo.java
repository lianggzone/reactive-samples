package com.lianggzone.rxjava2.samples.backpressure;

import java.util.concurrent.TimeUnit;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class BackPressureMissingDemo {
    public static void main(String[] args) throws InterruptedException {
        Flowable.create(e -> {
            for(int i = 0; i < 128; i++) {
                e.onNext(i);
            }
        }, BackpressureStrategy.MISSING)
        .subscribeOn(Schedulers.newThread())
        .observeOn(Schedulers.io())
        .subscribe(System.out::println);

        TimeUnit.MINUTES.sleep(1L);
    }
}
