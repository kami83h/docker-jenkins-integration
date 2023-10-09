package com.kami83h.dockerjenkinsdemo.dao;

import com.kami83h.dockerjenkinsdemo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
