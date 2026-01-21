package com.example.spring_6_webapp.services;

import com.example.spring_6_webapp.domain.Book;
import com.example.spring_6_webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override //@Override is necessary because we are implementing an interface method
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
