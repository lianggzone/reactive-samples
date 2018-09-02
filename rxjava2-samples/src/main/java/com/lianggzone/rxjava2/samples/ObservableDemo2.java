package com.lianggzone.rxjava2.samples;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservableDemo2 {
    public static void main(String[] args) {
        Observable.<String>create(emitter -> {
            emitter.onNext("Hello World");
            emitter.onNext("Hello World");
            emitter.onComplete();
            emitter.onNext("Hello World");
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observer.onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("Observer.onNext: " + s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Observer.onError");
            }

            @Override
            public void onComplete() {
                System.out.println("Observer.onComplete");
            }
        });
    }
}