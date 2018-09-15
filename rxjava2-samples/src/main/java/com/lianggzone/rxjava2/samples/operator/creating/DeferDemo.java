package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;

public class DeferDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> observable = Observable.defer(() -> {
            long time = System.currentTimeMillis();
            return Observable.just(time);
        });
        observable.subscribe(System.out::println);
        Thread.sleep(1000L);
        observable.subscribe(System.out::println);
    }
}
