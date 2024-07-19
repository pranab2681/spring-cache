package com.codingmirchi.cache.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + '}';
    }

}
