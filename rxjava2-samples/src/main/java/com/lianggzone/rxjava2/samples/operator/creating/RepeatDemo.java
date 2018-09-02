package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;

public class RepeatDemo {
    public static void main(String[] args) {
        Observable.just("Hello World")
                .repeat(10)
                .subscribe(System.out::println);
    }
}
