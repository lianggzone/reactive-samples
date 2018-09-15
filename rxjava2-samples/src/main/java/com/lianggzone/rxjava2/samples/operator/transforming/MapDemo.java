package com.lianggzone.rxjava2.samples.operator.transforming;

import io.reactivex.Observable;

public class MapDemo {
    public static void main(String[] args) {
        Observable.range(0, 10)
            .map(x -> 10 * x)
            .subscribe(System.out::println);
    }
}
