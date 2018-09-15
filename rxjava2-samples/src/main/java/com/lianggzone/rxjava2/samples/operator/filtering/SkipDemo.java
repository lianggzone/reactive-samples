package com.lianggzone.rxjava2.samples.operator.filtering;

import io.reactivex.Observable;

public class SkipDemo {
    public static void main(String[] args){
        Observable.range(1, 100).skip(3).subscribe(System.out::println);
    }
}
