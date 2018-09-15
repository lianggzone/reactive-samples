package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class AllDemo {
    public static void main(String[] args) {
        Observable.range(1, 10).all(x -> x < 11).subscribe(System.out::println);
        Observable.range(1, 10).all(x -> x < 5).subscribe(System.out::println);
    }
}
