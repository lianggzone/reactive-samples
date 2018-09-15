package com.lianggzone.rxjava2.samples.operator.connectable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.ConnectableObservable;

public class ConnectDemo2 {
    public static void main(String[] args) throws InterruptedException {
        ConnectableObservable connectableObservable = Observable.interval(1, TimeUnit.SECONDS).take(5).publish();

        Disposable disposable1 = connectableObservable.subscribe(s -> System.out.println("subscribe1 : " + s));

        TimeUnit.SECONDS.sleep(2L);

        Disposable disposable2 = connectableObservable.subscribe(s -> System.out.println("subscribe2 : " + s));

        connectableObservable.connect();

        TimeUnit.SECONDS.sleep(3L);

        disposable2.dispose();

        TimeUnit.MINUTES.sleep(10L);
    }
}
