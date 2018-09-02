package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Maybe;

public class MaybeDemo {
    public static void main(String[] args) {
        Maybe.<String>create(e -> {
            e.onComplete();
            e.onSuccess("success");
            e.onSuccess("success");
        }).subscribe(System.out::println);
    }
}
