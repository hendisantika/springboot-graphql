package com.hendisantika.springbootgraphql.service;

import com.hendisantika.springbootgraphql.entity.Book;
import com.hendisantika.springbootgraphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-10
 * Time: 07:44
 */
@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    @PostConstruct
    public void initBooks() {
        repository.save(new Book("101", "The Science of Marvel",
                "22-12-2017", new String[]{"Sebastian"},
                "Infinity Stones"));
        repository.save(new Book("102", "The Sixth Extinction",
                "22-12-2017", new String[]{"Sebastian", "Elizabeth"},
                "Infinity Stones"));
        repository.save(new Book("103", "The Science of Marvel -2",
                "22-12-2019", new String[]{"Sebastian"},
                "Infinity Stones"));
    }

    public List<Book> findAllBooks() {
        return repository.findAll();
    }

    public Book findBookById(String movieId) {
        return repository.findById(movieId).get();
    }
}