package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Completable;

public class CompletableDemo3 {
    public static void main(String[] args) {
        Completable.complete().subscribe(System.out::println);
    }
}
