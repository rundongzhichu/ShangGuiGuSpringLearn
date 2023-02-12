package com.spring.annoaop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("开始计算 a = " + a + ", b = " + b);
        int res = a +b;
        System.out.println("计算结果 res = " + res);
        return res;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a - b;
    }
}
