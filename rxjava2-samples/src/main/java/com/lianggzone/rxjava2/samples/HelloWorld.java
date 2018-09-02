package com.lianggzone.rxjava2.samples;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import org.reactivestreams.Subscriber;

import java.util.function.Consumer;

public class HelloWorld {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
                observableEmitter.onNext("Hello World!");
            }
        }).subscribe(System.out::println);
    }
}
