package com.lianggzone.rxjava2.samples;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SingleDemo2 {
    public static void main(String[] args) {
        Single.<String>create(e -> {
            e.onSuccess("success");
        }).subscribe(System.out::println);
    }
}
