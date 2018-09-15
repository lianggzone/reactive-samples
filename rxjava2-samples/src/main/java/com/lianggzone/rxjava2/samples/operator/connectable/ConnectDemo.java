package com.lianggzone.rxjava2.samples.operator.connectable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ConnectDemo {
    public static void main(String[] args) throws InterruptedException {
        ConnectableObservable connectableObservable = Observable.interval(1, TimeUnit.SECONDS).take(5).publish();

        connectableObservable.subscribe(s -> System.out.println("subscribe1 : " + s));

        TimeUnit.SECONDS.sleep(2L);

        connectableObservable.subscribe(s -> System.out.println("subscribe2 : " + s));

        connectableObservable.connect();

        TimeUnit.MINUTES.sleep(10L);
    }
}
