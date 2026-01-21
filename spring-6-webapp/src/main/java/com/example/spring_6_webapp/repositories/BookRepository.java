package com.example.spring_6_webapp.repositories;

import com.example.spring_6_webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
