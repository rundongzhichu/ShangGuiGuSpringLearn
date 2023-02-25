package com.spring.annotransaction.service;

public interface BookService {
    /**
     * 买书操作
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}