package com.lianggzone.rxjava2.samples.operator.collection;

import io.reactivex.Observable;

import java.util.concurrent.ConcurrentHashMap;

public class ToMultiMapDemo {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toMultimap(String::length)
                .subscribe(System.out::println);
    }
}
