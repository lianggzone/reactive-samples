package com.lianggzone.rxjava2.samples.operator.transforming;

import io.reactivex.Observable;

public class ScanDemo {
    public static void main(String[] args) {
        Observable.range(1, 10).scan((x,y) -> x + y).subscribe(System.out::println);
    }
}
