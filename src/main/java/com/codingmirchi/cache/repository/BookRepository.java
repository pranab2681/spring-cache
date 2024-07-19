package com.codingmirchi.cache.repository;


import com.codingmirchi.cache.entity.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
