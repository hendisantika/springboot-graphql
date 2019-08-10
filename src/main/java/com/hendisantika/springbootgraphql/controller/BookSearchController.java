package com.hendisantika.springbootgraphql.controller;

import com.hendisantika.springbootgraphql.datafetcher.AllBookDataFetcher;
import com.hendisantika.springbootgraphql.datafetcher.BookDataFetcher;
import com.hendisantika.springbootgraphql.service.BookService;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-10
 * Time: 07:49
 */
@RestController
@RequestMapping("/bookstore")
public class BookSearchController {
    @Autowired
    private BookService service;
    // load graphqls file
    @Value("classpath:book.schema")
    private Resource schemaResource;

    @Autowired
    private AllBookDataFetcher allBookDataFetcher;

    @Autowired
    private BookDataFetcher bookDataFetcher;

    private GraphQL graphQL;
}
