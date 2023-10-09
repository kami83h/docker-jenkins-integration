package com.kami83h.dockerjenkinsdemo;

import com.kami83h.dockerjenkinsdemo.dao.BookRepository;
import com.kami83h.dockerjenkinsdemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping("/book")
public class DockerJenkinsDemoApplication {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> getBooks(){

        return bookRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsDemoApplication.class, args);
    }

}
