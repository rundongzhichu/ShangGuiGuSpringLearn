package com.spring.jdbc.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        // 实现对数据库的添加操作
        String sql = "insert into t_temp values(NULL, ?, ?, ?)";
        int influenceRows = 0;
        influenceRows = jdbcTemplate.update(sql, "东方不败", 12, "1");
        influenceRows = jdbcTemplate.update(sql, "岳不群", 42, "1");
        System.out.println("influenceRowNum = " + influenceRows);
        influenceRows = jdbcTemplate.update(sql, "林平之", 25, "1");
        System.out.println("influenceRowNum = " + influenceRows);
    }

    @Test
    public void testDelete() {
        String sql = "delete from t_temp where id=?";
        int influenceRowNum = 0;
        influenceRowNum = jdbcTemplate.update(sql, 3);
        System.out.println("influenceRowNum = " + influenceRowNum);
    }

    @Test
    public void testUpdate(){
        String sql = "update t_temp set name=? where id=?";
        int influenceRowNum = 0;
        influenceRowNum = jdbcTemplate.update(sql, "林平之atguigu", 3);
        System.out.println("influenceRowNum = " + influenceRowNum);
    }

    @Test
    public void testSelect() {
        // 查一个Object， 写法1
        String sql = "select * from t_temp where id=?";
        Emp res = (Emp) jdbcTemplate.queryForObject(sql, new Emp<Emp<?>>(), 2);
        System.out.println("res.getName() = " + res.getName());

        // 查一个Object， 写法2
        sql = "select * from t_temp where id=?";
        res = (Emp) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println("res.getName() = " + res.getName());

        // 写法三 函数式编程
        sql = "select * from t_temp where id=?";
        res = jdbcTemplate.queryForObject(sql, (resultSet, rowNum)->{
            Emp emp = new Emp(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("sex")
            );
            System.out.println("rowNum = " + rowNum);
            return emp;
        }, 2);
        System.out.println("res.getName() = " + res.getName());

    }

    @Test
    public void testSelectList() {
        // 写法1
        String sql = "select * from t_temp";
        List<Emp> res = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        res.stream().forEach(r->System.out.println("res.getName() = " + r.getName()));

        // 写法2
        sql = "select * from t_temp";
        res = jdbcTemplate.query(sql, (resultSet, rowNum)->{
            Emp emp = new Emp(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("sex")
            );
            System.out.println("rowNum = " + rowNum);
            return emp;
        });
        res.stream().forEach(r->System.out.println("res.getName() = " + r.getName()));
    }

}
