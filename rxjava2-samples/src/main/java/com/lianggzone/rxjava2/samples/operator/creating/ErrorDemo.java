package com.lianggzone.rxjava2.samples.operator.creating;

import java.io.IOException;

import io.reactivex.Observable;

public class ErrorDemo {
    public static void main(String[] args) {
        Observable.error(new IOException()).subscribe(System.out::println);
    }
}
