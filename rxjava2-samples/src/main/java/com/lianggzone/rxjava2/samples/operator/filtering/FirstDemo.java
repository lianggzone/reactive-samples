package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class FirstDemo {
    public static void main(String[] args) {
        Observable.range(101, 10).first(1).subscribe(System.out::println);

        Observable.empty().first(2).subscribe(System.out::println);
    }
}
