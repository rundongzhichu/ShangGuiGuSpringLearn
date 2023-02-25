package com.spring.annotransaction.service.iml;

import com.spring.annotransaction.dao.BookDao;
import com.spring.annotransaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    /**
     * service中访问数据库
     * @param userId
     * @param bookId
     */
    @Autowired
    //创建持久层对象
    private BookDao bookDao;

    @Transactional
    @Override
    public void buyBook(Integer userId, Integer bookId) {
        try{
            //1.查询图书价格
            Integer price= bookDao.getPriceByBookId(bookId);
            //2.更新图书的库存
            bookDao.updateStock(bookId);
            //3.更新用户的余额
            //条件：更新的是哪个用户余额，userId，price传进来
            bookDao.updateBalance(userId,price);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
