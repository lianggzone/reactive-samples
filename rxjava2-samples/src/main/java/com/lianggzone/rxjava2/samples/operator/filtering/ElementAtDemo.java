package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class ElementAtDemo {
    public static void main(String[] args) {
        Observable.range(0, 100).elementAt(2).subscribe(System.out::println);
    }
}
