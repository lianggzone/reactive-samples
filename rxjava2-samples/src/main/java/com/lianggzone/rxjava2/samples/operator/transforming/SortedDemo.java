package com.lianggzone.rxjava2.samples.operator.transforming;

import io.reactivex.Observable;

import java.util.Comparator;

public class SortedDemo {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3).sorted().subscribe(System.out::println);
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);
    }
}
