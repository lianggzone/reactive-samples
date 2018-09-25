package com.lianggzone.rxjava2.samples.operator.combining;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ZipDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> one = Observable.just("Liang", "Gzone", "白岳", "blog.720ui.com", "LiangGzone");
        Observable<Long> two = Observable.interval(1, TimeUnit.SECONDS);
        Observable.zip(one, two, (v1,v2)-> v1 + "_" + v2)
            .subscribe(System.out::println);

        TimeUnit.SECONDS.sleep(10L);
    }
}
