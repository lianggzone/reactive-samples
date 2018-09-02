package com.lianggzone.rxjava2.samples;

import io.reactivex.Completable;
import io.reactivex.Observable;

public class CompletableDemo2 {
    public static void main(String[] args) {
        Completable.create(e -> {
            e.onComplete();
        }).andThen(Observable.range(0, 10))
        .subscribe(System.out::println);
        
    }
}
