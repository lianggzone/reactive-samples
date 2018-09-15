package com.lianggzone.rxjava2.samples.operator.connectable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class RefCountDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable observable = Observable
            .interval(1, TimeUnit.SECONDS)
            .take(50)
            .publish()
            .refCount();

        Disposable disposable1 = observable.subscribe(s -> System.out.println("subscribe1 : " + s));

        TimeUnit.SECONDS.sleep(2L);

        Disposable disposable2 = observable.subscribe(s -> System.out.println("subscribe2 : " + s));

        disposable1.dispose();

        TimeUnit.SECONDS.sleep(2L);

        disposable2.dispose();

        TimeUnit.MINUTES.sleep(10L);
    }
}
