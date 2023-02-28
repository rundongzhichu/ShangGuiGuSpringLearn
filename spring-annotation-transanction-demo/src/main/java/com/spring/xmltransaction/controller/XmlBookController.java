package com.spring.xmltransaction.controller;

import com.spring.xmltransaction.service.BookService;
import com.spring.xmltransaction.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**

 CREATE TABLE `t_book` (
 `book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
 `book_name` varchar(20) DEFAULT NULL COMMENT '图书名称',
 `price` int(11) DEFAULT NULL COMMENT '价格',
 `stock` int(10) unsigned DEFAULT NULL COMMENT '库存（无符号）',
 PRIMARY KEY (`book_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
 insert into `t_book`(`book_id`,`book_name`,`price`,`stock`) values (1,'斗破苍
 穹',80,100),(2,'斗罗大陆',50,100);
 CREATE TABLE `t_user` (
 `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
 `username` varchar(20) DEFAULT NULL COMMENT '用户名',
 `balance` int(10) unsigned DEFAULT NULL COMMENT '余额（无符号）',
 PRIMARY KEY (`user_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
 insert into `t_user`(`user_id`,`username`,`balance`) values (1,'admin',50);

 */

@Controller
public class XmlBookController {
    //controller需要用到BookSdervice对象
    //自动装配
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    //买书的时候，需要知道谁买书，也要知道买的哪一本书，所以要把userId和bookId传过来
    public void buyBook(Integer userId,Integer bookId){
        //调用bookService，把userId和bookId传进来
        bookService.buyBook(userId,bookId);
    }

    // 结账
    public void checkout(Integer userId, Integer[] bookIds) {
        checkoutService.checkout(userId, bookIds);
    }

}