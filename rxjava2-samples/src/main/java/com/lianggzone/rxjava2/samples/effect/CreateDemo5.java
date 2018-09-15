package com.lianggzone.rxjava2.samples.effect;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class CreateDemo5 {
    public static void main(String[] args) {
        Observable observable = Observable.create(emitter -> asyncProcessingOnSubscribe(emitter));
        observable.subscribe(o -> System.out.println(o));
    }

    private static void asyncProcessingOnSubscribe(ObservableEmitter emitter) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (!emitter.isDisposed()) {
                    emitter.onNext("item : " + i);
                }
            }
        });
        thread.start();
    }
}
