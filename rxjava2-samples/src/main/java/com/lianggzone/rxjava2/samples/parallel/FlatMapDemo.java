package com.lianggzone.rxjava2.samples.parallel;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class FlatMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.range(0, 50).flatMap(o ->
            Observable.just(o)
                .subscribeOn(Schedulers.computation())
                .map(x -> String.valueOf(x))
        ).subscribe(x -> System.out.println("value :" + x + ", thread : " + Thread.currentThread().getName()));

        TimeUnit.MINUTES.sleep(1L);
    }
}
