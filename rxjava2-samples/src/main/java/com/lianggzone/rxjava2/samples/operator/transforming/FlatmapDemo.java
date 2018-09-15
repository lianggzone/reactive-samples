package com.lianggzone.rxjava2.samples.operator.transforming;

import java.util.List;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class FlatmapDemo {
    public static void main(String[] args) {
        Author author = Author.builder()
            .name("LiangGzone")
            .blogs(ImmutableList.<String>of("http://blog.720ui.com","http://docs.720ui.com"))
            .build();

        Observable.<Author>just(author)
            .flatMap(a -> Observable.fromIterable(a.getBlogs()))
            .subscribe(System.out::println);

        Observable.<Author>just(author)
            .flatMapIterable(Author::getBlogs)
            .subscribe(System.out::println);

        Observable.<Author>just(author)
            .concatMap(a -> Observable.fromIterable(a.getBlogs()))
            .subscribe(System.out::println);
    }
}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Author {
    private String name;
    private List<String> blogs;
}