package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservableDemo {
    public static void main(String[] args) {
        Observable<String> observable = Observable.create(emitter -> {
            emitter.onNext("Hello World");
            emitter.onComplete();
        });

        Observer<String> observer = new Observer<String>() {
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
        };

        observable.subscribe(observer);
    }
}
