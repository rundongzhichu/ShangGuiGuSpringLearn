package com.spring.annotransaction.service;

public interface CheckoutService {
    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
