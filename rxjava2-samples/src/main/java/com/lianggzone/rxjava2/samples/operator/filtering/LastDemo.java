package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class LastDemo {
    public static void main(String[] args) {
        Observable.range(101, 10).last(1).subscribe(System.out::println);

        Observable.empty().last(2).subscribe(System.out::println);
    }
}
