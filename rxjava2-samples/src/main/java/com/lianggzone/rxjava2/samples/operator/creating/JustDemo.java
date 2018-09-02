package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JustDemo {
    public static void main(String[] args) {
        Observable.just("Hello World").subscribe(System.out::println);
    }
}
