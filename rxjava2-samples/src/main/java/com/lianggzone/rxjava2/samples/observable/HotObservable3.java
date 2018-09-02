package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class HotObservable3 {
    public static void main(String[] args) {
        Consumer<Long> consumer1 = a -> System.out.println("consumer1:"+a);
        Consumer<Long> consumer2 = a -> System.out.println("consumer2:"+a);
        Consumer<Long> consumer3 = a -> System.out.println("consumer3:"+a);

        ConnectableObservable<Long> connectableObservable = Observable.create((ObservableOnSubscribe<Long>) e -> {
            Observable.interval(10, TimeUnit.MICROSECONDS, Schedulers.computation())
                    .take(Integer.MAX_VALUE)
                    .subscribe(e::onNext);
        }).observeOn(Schedulers.newThread()).publish();

        connectableObservable.connect();

        Observable<Long> observable = connectableObservable.refCount();

        Disposable disposable1 = observable.subscribe(consumer1);
        Disposable disposable2 = observable.subscribe(consumer2);

        observable.subscribe(consumer3);

        try{
            Thread.sleep(10L);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("==============================");

        disposable1.dispose();
        disposable2.dispose();

        observable.subscribe(consumer1);
        observable.subscribe(consumer2);

        try{
            Thread.sleep(10L);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
