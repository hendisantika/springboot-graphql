package com.hendisantika.springbootgraphql.datafetcher;

import com.hendisantika.springbootgraphql.entity.Book;
import com.hendisantika.springbootgraphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-10
 * Time: 07:47
 */
@Component
public class AllBookDataFetcher implements DataFetcher<List<Book>> {
    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> get(DataFetchingEnvironment environment) {
        return repository.findAll();
    }

}