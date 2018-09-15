package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class FilterDemo {
    public static void main(String[] args) {
        Observable.range(1, 100).filter(t -> t % 2 == 0).subscribe(System.out::println);
    }
}
