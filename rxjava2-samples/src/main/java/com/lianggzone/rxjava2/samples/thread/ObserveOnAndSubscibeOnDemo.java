package com.lianggzone.rxjava2.samples.thread;

import java.util.concurrent.CountDownLatch;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class ObserveOnAndSubscibeOnDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch finishedLatch = new CountDownLatch(1);

        Observable.just(1, 2, 3, 4, 5)
            .observeOn(Schedulers.io())
            .map(i -> {
                System.out.println("A:" + Thread.currentThread().getName());
                return i;
            })
            .subscribeOn(Schedulers.single())
            .observeOn(Schedulers.newThread())
            .subscribe(s -> { System.out.println("B:" + Thread.currentThread().getName()); });

        finishedLatch.await();
    }
}
