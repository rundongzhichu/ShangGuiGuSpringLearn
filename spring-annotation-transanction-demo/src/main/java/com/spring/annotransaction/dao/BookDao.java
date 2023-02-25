package com.spring.annotransaction.dao;

/**
 * 默认情况下，一个sql语句独占一个事务，且自动提交
 * 所以没有设置事务的情况下，三个sql语句独占一个事务且自动提交的。
 * 在mysql中，一个sql独占一个事务且自动提交
 * 所以得关闭事务提交，如果不关闭每个sql语句独占一个事务
 * 所以更新图书的库存成功，更新用户余额失败抛出sql异常
 */
public interface BookDao {
    //1.根据图书id查询图书的价格
    Integer getPriceByBookId(Integer bookId);
    //2.更新图书的库存
    void updateStock(Integer bookId);
    //3.更新用户的余额
    void updateBalance(Integer userId, Integer price);
}