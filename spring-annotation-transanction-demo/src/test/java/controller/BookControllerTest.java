package controller;

import com.spring.annotransaction.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        //用户id为1的用户买图书id为1的图书
        bookController.buyBook(1,1);
    }
}