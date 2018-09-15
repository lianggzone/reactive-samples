package com.lianggzone.rxjava2.samples.operator.combining;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class JoinDemo {
    public static void main(String[] args) {
        Observable<Integer> one = Observable.just(1, 3, 5, 7, 9);
        Observable<Integer> two = Observable.just(2, 4, 6);
        one.join(two,
            x -> Observable.just(x).delay(1, TimeUnit.SECONDS),
            y -> Observable.just(y).delay(1, TimeUnit.SECONDS),
            (x,y) -> "(" + x + "," + y + ")")
            .subscribe(System.out::println);
    }
}
