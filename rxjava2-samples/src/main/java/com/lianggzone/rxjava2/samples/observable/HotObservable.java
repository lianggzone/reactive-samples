package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class HotObservable {
    public static void main(String[] args) {
        ConnectableObservable<String> observable = Observable.just("Liang", "Gzone").publish();
        observable.subscribe(s -> System.out.println("consumer1:" + s));
        observable.subscribe(s -> System.out.println("consumer2:" + s));
        observable.connect();
    }
}
