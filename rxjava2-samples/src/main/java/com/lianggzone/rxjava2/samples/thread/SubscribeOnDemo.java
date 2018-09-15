package com.lianggzone.rxjava2.samples.thread;

import java.util.concurrent.CountDownLatch;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class SubscribeOnDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch finishedLatch = new CountDownLatch(1);

        Observable.range(0, 1)
            .subscribeOn(Schedulers.single())
            .map(i -> {
                System.out.println("A:" + Thread.currentThread().getName());
                return i;
            })
            .subscribe(s -> { System.out.println("B:" + Thread.currentThread().getName()); });

        finishedLatch.await();
    }
}
