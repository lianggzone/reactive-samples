package com.lianggzone.rxjava2.samples.operator.mathematical;

import io.reactivex.Observable;

import java.util.Comparator;

public class CountDemo {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3).count().subscribe(System.out::println);
    }
}
