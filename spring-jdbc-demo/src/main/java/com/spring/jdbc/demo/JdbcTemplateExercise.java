package com.spring.jdbc.demo;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * 创建数据库表的指令

 CREATE TABLE IF NOT EXISTS `t_temp`(
 `id` INT UNSIGNED AUTO_INCREMENT,
 `name` VARCHAR(100) DEFAULT NULL COMMENT '姓名',
 `age` INT DEFAULT NULL COMMENT '年龄',
 `sex` VARCHAR(2) DEFAULT NULL COMMENT '性别',
 PRIMARY KEY ( `id` )
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */

@Component
public class JdbcTemplateExercise {


}


