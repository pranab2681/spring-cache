package com.codingmirchi.cache.controller;

import com.codingmirchi.cache.entity.Book;
import com.codingmirchi.cache.repository.SimpleBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private SimpleBookRepository bookRepository;

    @GetMapping("/api/v1/getBook")
    public Book getBookByISBN(@RequestParam("isbn") String isbn) {
        return bookRepository.getByIsbn(isbn);
    }
}
