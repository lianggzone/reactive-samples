package com.lianggzone.rxjava2.samples;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;

public class MaybeDemo {
    public static void main(String[] args) {
        Maybe.<String>create(e -> {
            e.onComplete();
            e.onSuccess("success");
            e.onSuccess("success");
        }).subscribe(System.out::println);
    }
}
