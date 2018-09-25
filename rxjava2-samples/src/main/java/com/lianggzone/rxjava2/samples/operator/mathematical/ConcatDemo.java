package com.lianggzone.rxjava2.samples.operator.mathematical;

import io.reactivex.Observable;

public class ConcatDemo {
    public static void main(String[] args) {
        Observable.concat(Observable.just(1), Observable.just(2)).subscribe(System.out::println);
    }
}
