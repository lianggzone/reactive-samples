package com.lianggzone.rxjava2.samples.operator.collection;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectDemo {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .collect(HashSet::new, HashSet::add)
                .subscribe(System.out::println);

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .collect(ImmutableList::builder, ImmutableList.Builder::add)
                .map(ImmutableList.Builder::build)
                .subscribe(System.out::println);
    }
}
