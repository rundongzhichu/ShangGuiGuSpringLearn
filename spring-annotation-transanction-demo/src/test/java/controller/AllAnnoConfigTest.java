package controller;

import com.spring.annotransaction.config.SpringConfig;
import com.spring.annotransaction.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllAnnoConfigTest {

    @Test
    public void testTxAllAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController controller = applicationContext.getBean("bookController", BookController.class);
        controller.checkout(1, new Integer[]{1,2});
    }

}
