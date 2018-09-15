package com.lianggzone.rxjava2.samples.operator.combining;

import io.reactivex.Observable;

public class ZipDemo {
    public static void main(String[] args) {
        Observable<Integer> one = Observable.just(1, 3, 5, 7, 9);
        Observable<Integer> two = Observable.just(2, 4, 6);
        Observable<Integer> three = Observable.just(11, 13, 15);
        Observable.zip(one, two, (v1,v2)-> v1+v2)
            .zipWith(three, (v1,v2)-> v1+v2)
            .subscribe(System.out::println);
    }
}
