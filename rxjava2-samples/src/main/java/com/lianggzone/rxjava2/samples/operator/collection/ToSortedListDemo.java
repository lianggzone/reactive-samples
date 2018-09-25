package com.lianggzone.rxjava2.samples.operator.collection;

import io.reactivex.Observable;

import java.util.concurrent.CopyOnWriteArrayList;

public class ToSortedListDemo {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3).toSortedList().subscribe(System.out::println);
    }
}
