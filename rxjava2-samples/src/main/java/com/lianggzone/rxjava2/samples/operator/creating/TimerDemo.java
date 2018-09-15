package com.lianggzone.rxjava2.samples.operator.creating;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TimerDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.timer(1, TimeUnit.SECONDS)
            .subscribe(v -> System.out.println("timer!"));

        TimeUnit.MINUTES.sleep(1L);
    }
}
