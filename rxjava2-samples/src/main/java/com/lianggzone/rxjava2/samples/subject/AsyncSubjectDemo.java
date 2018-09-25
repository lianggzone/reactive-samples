package com.lianggzone.rxjava2.samples.subject;

import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;

public class AsyncSubjectDemo {
    public static void main(String[] args) {
        Subject<String> subject = AsyncSubject.create();
        subject.subscribe(s -> System.out.println("Observer 1: " + s));
        subject.onNext("Liang");
        subject.onNext("Gzone");
        subject.onNext("blog.720ui.com");
        subject.onComplete();
        subject.subscribe(s -> System.out.println("Observer 2: " + s));
    }
}
