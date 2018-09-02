package com.lianggzone.rxjava2.samples;

import io.reactivex.Completable;

public class CompletableDemo {
    public static void main(String[] args) {
        Completable.fromAction(System.out::println).subscribe();
        
    }
}
