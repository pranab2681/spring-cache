package com.codingmirchi.cache.repository;

import com.codingmirchi.cache.entity.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        System.out.println("It is taking time to load for the isbn -> " + isbn);
        return new Book(isbn, "Programming with Mosh");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 10000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
