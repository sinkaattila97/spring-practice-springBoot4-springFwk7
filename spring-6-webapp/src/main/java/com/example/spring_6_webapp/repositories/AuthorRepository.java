package com.example.spring_6_webapp.repositories;

import com.example.spring_6_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
