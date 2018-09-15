package com.lianggzone.rxjava2.samples.thread;

import java.util.concurrent.CountDownLatch;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class ImportDemo {

    private static final int count = 1000;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch finishedLatch = new CountDownLatch(1);

        long t = System.nanoTime();
        Observable
            .range(0, count)
            .observeOn(Schedulers.newThread())
            .map(i -> {
                System.out.println("A:" + Thread.currentThread().getName());
                return i;
            })
            .subscribeOn(Schedulers.single())
            .subscribe(
                statusCode -> {
                    System.out.println("B:" + Thread.currentThread().getName());
                },
                error -> { },
                () -> { finishedLatch.countDown(); }
            );

        finishedLatch.await();

        t = (System.nanoTime() - t) / 1000000; //ms
        System.out.println("RxJavaWithoutBlocking TPS: " + count * 1000 / t);
    }
}

