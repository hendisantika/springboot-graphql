package com.hendisantika.springbootgraphql.repository;

import com.hendisantika.springbootgraphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-10
 * Time: 07:44
 */
public interface BookRepository extends JpaRepository<Book, String> {
}