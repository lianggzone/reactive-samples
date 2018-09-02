package com.lianggzone.rxjava2.samples;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class FlowableDemo {
    public static void main(String[] args) {
        Flowable.<String>create(e -> {
            e.onNext("Hello world!");
            e.onNext("Hello World");
            e.onComplete();
            e.onNext("Hello World");
        }, BackpressureStrategy.MISSING).subscribe(new Subscriber<String>(){
            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("Subscriber.onSubscribe");
            }
            @Override
            public void onNext(String s) {
                System.out.println("Subscriber.onNext: " + s);
            }
            @Override
            public void onError(Throwable throwable) {
                System.out.println("Subscriber.onError");
            }
            @Override
            public void onComplete() {
                System.out.println("Subscriber.onComplete");
            }
        });
    }
}