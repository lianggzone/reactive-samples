package com.lianggzone.rxjava2.samples.observable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SingleDemo {
    public static void main(String[] args) {
        Single.<String>create(e -> {
            e.onSuccess("success");
            e.onSuccess("success");
        }).subscribe(new SingleObserver<String>(){
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("SingleObserver.onSubscribe");
            }
            @Override
            public void onSuccess(String s) {
                System.out.println("SingleObserver.onSuccess:"+s);
            }
            @Override
            public void onError(Throwable e) {
                System.out.println("SingleObserver.onError");
            }
        });
    }
}
