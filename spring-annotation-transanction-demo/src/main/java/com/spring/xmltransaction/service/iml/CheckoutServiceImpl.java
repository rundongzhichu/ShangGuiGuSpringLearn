package com.spring.xmltransaction.service.iml;

import com.spring.xmltransaction.service.BookService;
import com.spring.xmltransaction.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Transactional
    @Override
    public void checkout(Integer userId, Integer[] bookIds) {
        for (int bookId :
                bookIds) {
            bookService.buyBook(userId, bookId);
        }
    }
}
