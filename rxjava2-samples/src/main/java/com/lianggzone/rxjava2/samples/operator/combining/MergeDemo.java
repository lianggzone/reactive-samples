package com.lianggzone.rxjava2.samples.operator.combining;

import io.reactivex.Observable;

public class MergeDemo {
    public static void main(String[] args) {
        Observable<Integer> odds = Observable.just(1, 3, 5);
        Observable<Integer> evens = Observable.just(2, 4, 6);
        Observable.merge(odds, evens).subscribe(System.out::println);
    }
}
