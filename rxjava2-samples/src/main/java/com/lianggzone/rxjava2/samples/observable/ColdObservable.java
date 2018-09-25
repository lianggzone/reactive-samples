package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;

public class ColdObservable {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Liang", "Gzone");
        observable.subscribe(s -> System.out.println("consumer1:" + s));
        observable.subscribe(s -> System.out.println("consumer2:" + s));
    }
}
