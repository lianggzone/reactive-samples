package com.lianggzone.rxjava2.samples.operator.transforming;

import io.reactivex.Observable;

public class GroupDemo {
    public static void main(String[] args) {
        Observable.range(1,10).groupBy(i -> i%2 == 0 ? "偶数" : "奇数")
            .subscribe(k -> System.out.println(k.getKey()));
    }
}
