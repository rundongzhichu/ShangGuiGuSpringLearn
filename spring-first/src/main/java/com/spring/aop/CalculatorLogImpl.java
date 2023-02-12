package com.spring.aop;

public class CalculatorLogImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("start add a = " + a + " b = " + b);
        int res = a + b;
        System.out.println("add result res = " + res);
        System.out.println("add method end res = " + res);
        return res;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("start substract a = " + a + " b = " + b);
        int res = a - b;
        System.out.println("substract result res = " + res);
        System.out.println("substract method end res = " + res);
        return res;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("start multiply a = " + a + " b = " + b);
        int res = a * b;
        System.out.println("multiply result res = " + res);
        System.out.println("multiply method end res = " + res);
        return res;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("start divide a = " + a + " b = " + b);
        int res = a / b;
        System.out.println("divide result res = " + res);
        System.out.println("divide method end res = " + res);
        return res;
    }

}
