package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class SwitchIfEmptyDemo {
    public static void main(String[] args) {
        Observable.empty().switchIfEmpty(Observable.range(0,10))
            .subscribe(System.out::println);
    }
}
