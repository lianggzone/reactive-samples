package com.lianggzone.rxjava2.samples.effect;

import io.reactivex.Observable;

public class CreateDemo3 {
    public static void main(String[] args) {
        Observable.just("Hello World").subscribe(
            e -> System.out.println("onNext"),
            throwable -> System.out.println("onError"),
            () -> System.out.println("onComplete"),
            disposable -> System.out.println("onSubscribe"));
    }
}
