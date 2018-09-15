package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;

public class EmptyDemo {
    public static void main(String[] args) {
        Observable.empty().subscribe(System.out::println);
    }
}
