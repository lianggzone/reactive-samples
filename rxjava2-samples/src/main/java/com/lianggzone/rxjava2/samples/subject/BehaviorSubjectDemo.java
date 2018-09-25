package com.lianggzone.rxjava2.samples.subject;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class BehaviorSubjectDemo {
    public static void main(String[] args) {
        Subject<String> subject = BehaviorSubject.create();
        subject.subscribe(s -> System.out.println("Observer 1: " + s));
        subject.onNext("Liang");
        subject.onNext("Gzone");
        subject.onNext("blog.720ui.com");
        subject.subscribe(s -> System.out.println("Observer 2: " + s));
    }
}
