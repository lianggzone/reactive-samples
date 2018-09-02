package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;

public class ObservableDemo3 {
    public static void main(String[] args) {
        Observable.<String>create(emitter -> {
            emitter.onNext("Hello World");
            emitter.onNext("Hello World");
            emitter.onComplete();
            emitter.onNext("Hello World");
        }).subscribe(System.out::println);
    }
}