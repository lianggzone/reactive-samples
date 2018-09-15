package com.lianggzone.rxjava2.samples.backpressure;

import java.util.concurrent.TimeUnit;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class BackPressureLatestDemo {
    public static void main(String[] args) throws InterruptedException {
        Flowable.create(e -> {
            for(int i = 0; i < 200; i++) {
                e.onNext(i);
            }
        }, BackpressureStrategy.LATEST)
        .subscribeOn(Schedulers.newThread())
        .observeOn(Schedulers.io())
        .subscribe(System.out::println);

        TimeUnit.MINUTES.sleep(1L);
    }
}
