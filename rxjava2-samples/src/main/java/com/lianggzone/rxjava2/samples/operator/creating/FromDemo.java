package com.lianggzone.rxjava2.samples.operator.creating;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FromDemo {
    public static void main(String[] args) {
        // fromIterable example
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Observable.fromIterable(list).subscribe(System.out::println);
        // fromArray example
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Observable.fromArray(array).subscribe(System.out::println);
        // fromCallable example
        Callable<String> callable = () -> "Hello World!";
        Observable.fromCallable(callable).subscribe(System.out::println);
        // fromAction example
        Action action = () -> System.out.println("Hello World!");
        Completable.fromAction(action).subscribe(() -> System.out.println("Done"));
        // fromRunnable example
        Runnable runnable = () -> System.out.println("Hello World!");
        Completable.fromRunnable(runnable).subscribe(() -> System.out.println("Done"));
        // fromFuture example
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Future<String> future = executor.schedule(() -> "Hello world!", 1, TimeUnit.SECONDS);
        Observable.fromFuture(future).subscribe(System.out::println);
        executor.shutdown();
    }
}
