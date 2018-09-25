package com.lianggzone.rxjava2.samples.operator.collection;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;

import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ToListDemo {
    public static void main(String[] args) {
        //Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3).toList().subscribe(System.out::println);
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3).toList(CopyOnWriteArrayList::new).subscribe(System.out::println);
    }
}
