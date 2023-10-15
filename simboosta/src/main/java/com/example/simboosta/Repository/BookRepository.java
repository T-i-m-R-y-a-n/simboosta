package com.example.simboosta.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.simboosta.Entity.Book;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}