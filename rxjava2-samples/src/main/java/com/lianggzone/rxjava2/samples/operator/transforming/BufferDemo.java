package com.lianggzone.rxjava2.samples.operator.transforming;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class BufferDemo {
    public static void main(String[] args) throws InterruptedException {
        //Observable.range(1, 10).buffer(3).subscribe(System.out::println);
        /*Observable.interval(300, TimeUnit.MILLISECONDS)
                .buffer(1, TimeUnit.SECONDS)
                .subscribe(System.out::println);*/
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .buffer(1, TimeUnit.SECONDS, 2)
                .subscribe(System.out::println);

        TimeUnit.MINUTES.sleep(1);
    }
}
