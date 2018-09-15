package com.lianggzone.rxjava2.samples.operator.error_handle;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

public class CatchDemo2 {
    public static void main(String[] args) {
        Observable.<String>create(e -> {
            e.onNext("1");
            e.onNext("2");
            e.onError(new NullPointerException("NullPointerException"));
            e.onNext("4");
        }).<Function>onErrorResumeNext(
            (Function<? super Throwable, ? extends ObservableSource<? extends String>>)e -> Observable.just(e.getMessage()))
            .subscribe(System.out::println);
    }
}
