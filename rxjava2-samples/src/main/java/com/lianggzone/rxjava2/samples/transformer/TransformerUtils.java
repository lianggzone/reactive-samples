package com.lianggzone.rxjava2.samples.transformer;

import com.google.common.collect.ImmutableList;
import io.reactivex.FlowableTransformer;
import io.reactivex.ObservableTransformer;

public class TransformerUtils {

    public static <String> ObservableTransformer<Integer, java.lang.String> transformer(){
        return upstream -> upstream.map(x -> "items : " + java.lang.String.valueOf(x));
    }

    public static <T> ObservableTransformer<T, ImmutableList<T>> toImmutableList() {
        return upstream -> upstream.collect(ImmutableList::<T>builder, ImmutableList.Builder::add)
                .map(ImmutableList.Builder::build)
                .toObservable(); // must turn Single into Observable
    }

    public static <T> FlowableTransformer<T, ImmutableList<T>> toImmutableList4Flowable() {
        return upstream -> upstream.collect(ImmutableList::<T>builder, ImmutableList.Builder::add)
                .map(ImmutableList.Builder::build)
                .toFlowable(); // must turn Single into Flowable
    }
}
