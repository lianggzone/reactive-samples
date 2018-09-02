package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;

import java.util.concurrent.TimeUnit;

public class HotObservable2 {
    public static void main(String[] args) {
        Consumer<Long> consumer1 = a -> System.out.println("consumer1:"+a);
        Consumer<Long> consumer2 = a -> System.out.println("consumer2:"+a);
        Consumer<Long> consumer3 = a -> System.out.println("consumer3:"+a);

        Observable<Long> observable = Observable.create((ObservableOnSubscribe<Long>) e -> {
            Observable.interval(10, TimeUnit.MICROSECONDS, Schedulers.computation())
                    .take(Integer.MAX_VALUE)
                    .subscribe(e::onNext);
        }).observeOn(Schedulers.newThread());

        PublishSubject<Long> subject = PublishSubject.create();
        observable.subscribe(subject);

        observable.subscribe(consumer1);
        observable.subscribe(consumer2);

        try{
            Thread.sleep(10L);
        }catch (Exception e){
            e.printStackTrace();
        }

        observable.subscribe(consumer3);

        try{
            Thread.sleep(20L);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
