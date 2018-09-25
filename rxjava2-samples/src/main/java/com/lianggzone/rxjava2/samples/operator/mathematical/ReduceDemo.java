package com.lianggzone.rxjava2.samples.operator.mathematical;

import io.reactivex.Observable;

public class ReduceDemo {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .reduce((total, next) -> total + next)
                .subscribe(System.out::println);
    }
}
