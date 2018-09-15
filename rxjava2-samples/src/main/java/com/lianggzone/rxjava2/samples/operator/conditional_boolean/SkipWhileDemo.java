package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class SkipWhileDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.range(0,10).skipWhile(x -> x < 2).subscribe(System.out::println);

    }
}
