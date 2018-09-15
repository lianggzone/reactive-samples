package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class SequenceEqualDemo {
    public static void main(String[] args) {
        Observable.sequenceEqual(Observable.range(0,10), Observable.range(0,10))
            .subscribe(System.out::println);
    }
}
