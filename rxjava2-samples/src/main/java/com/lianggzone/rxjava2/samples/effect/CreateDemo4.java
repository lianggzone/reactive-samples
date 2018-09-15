package com.lianggzone.rxjava2.samples.effect;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

public class CreateDemo4 {
    public static void main(String[] args) {
        Observable observable = Observable.create(new ObservableOnSubscribe() {

            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            if (!emitter.isDisposed()) {
                                emitter.onNext("item : " + i);
                            }
                        }
                    }
                });
                thread.start();
            }
        });

        observable.subscribe(new Consumer() {
            @Override
            public void accept(Object o) throws Exception {
                System.out.println(o);
            }
        });
    }
}
