package com.lianggzone.rxjava2.samples.operator.connectable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ReplayDemo {
    public static void main(String[] args) throws InterruptedException {
        ConnectableObservable observable = Observable
            .interval(1, TimeUnit.SECONDS)
            .take(50)
            .replay();
        observable.subscribe(s -> System.out.println("subscribe1 : " + s));
        observable.connect();
        observable.subscribe(s -> System.out.println("subscribe2 : " + s));

        TimeUnit.MINUTES.sleep(10L);
    }
}
