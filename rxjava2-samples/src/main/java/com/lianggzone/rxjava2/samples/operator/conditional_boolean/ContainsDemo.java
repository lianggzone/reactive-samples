package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class ContainsDemo {
    public static void main(String[] args) {
        Observable.range(1, 10).contains(10).subscribe(System.out::println);
        Observable.range(1, 10).contains(0).subscribe(System.out::println);
    }
}
