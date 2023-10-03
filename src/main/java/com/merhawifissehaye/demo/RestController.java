package com.merhawifissehaye.demo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public List<Book> index() {
        // return a collection of books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "978-0618640157"));
        books.add(new Book(2, "The Hobbit", "978-0547928227"));
        books.add(new Book(3, "The Silmarillion", "978-0618391110"));
        return books;
    }
}
