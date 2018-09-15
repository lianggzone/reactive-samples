package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class DistinctDemo {
    public static void main(String[] args) {
        Observable.just("1","2","1","3","2").distinct().subscribe(System.out::println);
    }
}
