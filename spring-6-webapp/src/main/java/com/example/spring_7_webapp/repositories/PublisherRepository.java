package com.example.spring_7_webapp.repositories;

import com.example.spring_7_webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
