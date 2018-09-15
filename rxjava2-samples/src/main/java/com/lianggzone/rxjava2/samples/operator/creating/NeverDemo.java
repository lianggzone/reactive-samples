package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;

public class NeverDemo {
    public static void main(String[] args) {
        Observable.never().subscribe(System.out::println);
    }
}
