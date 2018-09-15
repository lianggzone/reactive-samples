package com.lianggzone.rxjava2.samples.operator.filtering;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class DebounceDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("1","2","1","3","2").debounce(3, TimeUnit.SECONDS).subscribe(System.out::println);

        Thread.sleep(10000L);
    }
}
