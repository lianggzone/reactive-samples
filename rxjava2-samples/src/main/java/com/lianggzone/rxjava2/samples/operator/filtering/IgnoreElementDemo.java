package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class IgnoreElementDemo {
    public static void main(String[] args) {
        Observable.range(0, 100).ignoreElements().subscribe(() -> System.out.println("onComplete"));
    }
}
