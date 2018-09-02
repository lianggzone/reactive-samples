package com.lianggzone.rxjava2.samples;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservableDemo4 {
    public static void main(String[] args) {
        Observable.just("Hello World")
                .doOnNext(s -> System.out.println("doOnNext :" + s))
                .doAfterNext(s -> System.out.println("doAfterNext :" + s))
                .doOnComplete(() -> System.out.println("doOnComplete"))
                .doAfterTerminate(() -> System.out.println("doAfterTerminate"))
                .subscribe(new Observer<String>() {
                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("complete");
                    }

                    @Override
                    public void onSubscribe(Disposable disposable) {
                        System.out.println("subscribe");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println(s);
                    }
                });
    }
}
