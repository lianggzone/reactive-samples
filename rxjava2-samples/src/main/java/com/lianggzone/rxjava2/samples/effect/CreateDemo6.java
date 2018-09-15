package com.lianggzone.rxjava2.samples.effect;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

public class CreateDemo6 {
    public static void main(String[] args) {
        Observable observable = Observable.<Integer>range(0, 100);
        observable = observable.skip(5);
        observable = observable.map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) throws Exception {
                return i + 100;
            }
        });
        observable.subscribe(new Consumer() {
            @Override
            public void accept(Object o) throws Exception {
                System.out.println("onNext : " + o);
            }
        });
    }
}
