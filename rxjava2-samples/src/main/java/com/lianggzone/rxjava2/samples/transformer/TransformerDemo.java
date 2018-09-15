package com.lianggzone.rxjava2.samples.transformer;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;

public class TransformerDemo {
    public static void main(String[] args) {
        Observable.just(1,2,3,4,5).compose(transformer()).subscribe(System.out::println);
    }

    public static <String> ObservableTransformer<Integer, java.lang.String> transformer(){
        return upstream -> upstream.map(x -> "items : " + java.lang.String.valueOf(x));
    }
}
