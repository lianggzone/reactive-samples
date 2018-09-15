package com.lianggzone.rxjava2.samples.effect;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class CreateDemo2 {
    public static void main(String[] args) {
        Observable observable = Observable.just("Hello World");

        observable.subscribe(new Consumer() {
             @Override
             public void accept(Object o) throws Exception {
                 System.out.println("onNext");
             }
         }, new Consumer<Throwable>() {
             @Override
             public void accept(Throwable throwable) throws Exception {
                 System.out.println("onError");
             }
         }, new Action() {
            @Override
            public void run() throws Exception {
                System.out.println("onComplete");
            }
         }, new Consumer<Disposable>() {
            @Override
            public void accept(Disposable disposable) throws Exception {
                System.out.println("onSubscribe");
            }
         });
    }
}
