package com.lianggzone.rxjava2.samples.subject;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class PublishSubjectDemo {
    public static void main(String[] args) {
        Subject<String> subject = PublishSubject.create();
        subject.subscribe(System.out::println);
        subject.onNext("Liang");
        subject.onNext("Gzone");
        subject.onNext("blog.720ui.com");
        subject.onComplete();
    }
}
