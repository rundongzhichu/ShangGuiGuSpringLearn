package com.spring.xmltransaction.dao.iml;

import com.spring.xmltransaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    //创建一个jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Integer getPriceByBookId(Integer bookId) {
        //查询单行单列的数据
        String sql="select price from t_book where book_id =?";
        //sql语句，查询的数据转换的类型，占位符所附的值
        return jdbcTemplate.queryForObject(sql,Integer.class,bookId);
    }
    @Override
    public void updateStock(Integer bookId) {
        String sql="update t_book set stock = stock-1 where book_id=?";
        jdbcTemplate.update(sql,bookId);
    }
    @Override
    public void updateBalance(Integer userId, Integer price) {
        //传输过来的价格多少，余额就减多少
        String sql="update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql,price,userId);
    }
}
