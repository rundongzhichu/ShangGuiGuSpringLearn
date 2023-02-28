package controller;

import com.spring.xmltransaction.controller.XmlBookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:beans-xml.xml")
public class XMLXmlBookControllerTest {

    @Autowired
    private XmlBookController xmlBookController;

    @Test
    public void testBuyBook(){
        //用户id为1的用户买图书id为1的图书
        xmlBookController.buyBook(1,2);
    }

}
