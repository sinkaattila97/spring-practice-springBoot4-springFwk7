package com.example.spring_6_webapp.repositories;

import com.example.spring_6_webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
