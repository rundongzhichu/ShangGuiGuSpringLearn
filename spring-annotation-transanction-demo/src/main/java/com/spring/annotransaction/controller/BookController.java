package com.spring.annotransaction.controller;

import com.spring.annotransaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookController {
    //controller需要用到BookSdervice对象
    //自动装配
    @Autowired
    private BookService bookService;

    //买书的时候，需要知道谁买书，也要知道买的哪一本书，所以要把userId和bookId传过来
    public void buyBook(Integer userId,Integer bookId){
        //调用bookService，把userId和bookId传进来
        bookService.buyBook(userId,bookId);
    }
}