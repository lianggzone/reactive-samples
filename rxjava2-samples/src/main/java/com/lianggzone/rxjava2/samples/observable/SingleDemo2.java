package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Single;

public class SingleDemo2 {
    public static void main(String[] args) {
        Single.just("success").toObservable().subscribe(System.out::println);
    }
}
