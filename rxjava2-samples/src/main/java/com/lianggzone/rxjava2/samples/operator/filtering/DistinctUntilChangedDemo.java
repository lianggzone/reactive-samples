package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class DistinctUntilChangedDemo {
    public static void main(String[] args) {
        Observable.just(1, 1, 1, 2, 2, 3, 3, 2).distinctUntilChanged().subscribe(System.out::println);
    }
}
