package basic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

public class OptionalUsage {


    @Data
    @AllArgsConstructor
    @Builder
    public static class Person {
        private String name;
        private String level;
    }

    @Data
    @AllArgsConstructor
    @Builder
    public static class Book {

        private String name;
        private Person reviewer;
    }

    public static void main(String[] args) {

        Book myBook = Book.builder()
                .name("My Book")
                .reviewer(null)
                .build();

        Book anotherBook = Book.builder()
                .name("Another Book")
                .reviewer(Person.builder()
                        .name("James Rodriguez")
                        .build())
                .build();

        System.out.println(getReviewerName(myBook));
        System.out.println(getReviewerName(anotherBook));
    }

    public static String getReviewerName(Book book) {
        return book.getReviewer().getName();
    }

}
