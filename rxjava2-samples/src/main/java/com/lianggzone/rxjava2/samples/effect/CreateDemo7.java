package com.lianggzone.rxjava2.samples.effect;

import io.reactivex.Observable;

public class CreateDemo7 {
    public static void main(String[] args) {
        Observable.<Integer>range(0, 100)
            .skip(5)
            .map(i -> i + 100)
            .subscribe(System.out::println);
    }
}
