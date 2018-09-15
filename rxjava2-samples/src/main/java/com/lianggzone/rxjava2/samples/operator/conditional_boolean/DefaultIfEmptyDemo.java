package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class DefaultIfEmptyDemo {
    public static void main(String[] args) {
        Observable.empty().defaultIfEmpty(520).subscribe(System.out::println);
    }
}
