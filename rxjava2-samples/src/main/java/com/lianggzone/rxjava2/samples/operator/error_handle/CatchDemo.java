package com.lianggzone.rxjava2.samples.operator.error_handle;

import io.reactivex.Observable;

public class CatchDemo {
    public static void main(String[] args) {
        Observable.<String>create(e -> {
            e.onNext("1");
            e.onNext("2");
            e.onError(new NullPointerException("NullPointerException"));
            e.onNext("4");
        }).onErrorReturn(throwable -> throwable.getMessage())
            .subscribe(System.out::println);
    }
}
