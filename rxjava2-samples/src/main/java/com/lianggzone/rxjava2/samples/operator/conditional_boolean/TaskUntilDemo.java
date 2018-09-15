package com.lianggzone.rxjava2.samples.operator.conditional_boolean;

import io.reactivex.Observable;

public class TaskUntilDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.just(1,2,3,4,5).takeUntil(i->i<3).subscribe(System.out::println);

    }
}
