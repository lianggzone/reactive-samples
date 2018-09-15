package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;

public class RangeDemo {
    public static void main(String[] args) {
        Observable.range(101, 10).subscribe(System.out::println);
        Observable.rangeLong(101, 10).subscribe(System.out::println);
    }
}
