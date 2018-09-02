package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;

public class JustDemo2 {
    public static void main(String[] args) {
        Observable.just("Liang","Gzone").subscribe(System.out::println);
    }
}
