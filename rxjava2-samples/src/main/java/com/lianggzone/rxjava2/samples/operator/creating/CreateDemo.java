package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CreateDemo {
    public static void main(String[] args) {
        Observable.<Integer>create(emitter -> {
            try {
                if(!emitter.isDisposed()){
                    for (int i = 1; i < 5; i++) {
                        emitter.onNext(i);
                    }
                    emitter.onComplete();
                }
            } catch(Exception e){
                emitter.onError(e);
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observer.onSubscribe");
            }
            @Override
            public void onNext(Integer onNext) {
                System.out.println("Observer.onNext:" + onNext);
            }
            @Override
            public void onError(Throwable e) {
                System.out.println("Observer.onError");
            }
            @Override
            public void onComplete() {
                System.out.println("Observer.onComplete");
            }
        });
    }
}
