package com.lianggzone.rxjava2.samples.operator.combining;

import io.reactivex.Observable;

public class StartWithDemo {
    public static void main(String[] args) {
        Observable.just(2, 3).startWith(1).subscribe(System.out::println);
        Observable.just(2, 3).startWith(Observable.range(100, 2)).subscribe(System.out::println);
        Observable.just(2, 3).startWithArray(0, 1).subscribe(System.out::println);
    }
}
