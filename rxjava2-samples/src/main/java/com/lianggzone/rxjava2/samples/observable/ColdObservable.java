package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

public class ColdObservable {
    public static void main(String[] args) {
        Consumer<Long> consumer1 = a -> System.out.println("consumer1:"+a);
        Consumer<Long> consumer2 = a -> System.out.println("consumer2:"+a);

        Observable<Long> observable = Observable.<Long>create(e -> {
            Observable.interval(10, TimeUnit.MICROSECONDS, Schedulers.computation())
                    .take(Integer.MAX_VALUE)
                    .subscribe(e::onNext);
        }).observeOn(Schedulers.newThread());

        observable.subscribe(consumer1);
        observable.subscribe(consumer2);

        try{
            Thread.sleep(100L);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
