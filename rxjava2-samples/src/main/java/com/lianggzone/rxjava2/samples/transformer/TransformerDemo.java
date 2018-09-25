package com.lianggzone.rxjava2.samples.transformer;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;

public class TransformerDemo {
    public static void main(String[] args) {
        //Observable.just(1,2,3,4,5).compose(TransformerUtils.transformer()).subscribe(System.out::println);

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .compose(TransformerUtils.toImmutableList())
                .subscribe(System.out::println);
    }


}
