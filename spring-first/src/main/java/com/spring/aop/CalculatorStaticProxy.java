package com.spring.aop;

public class CalculatorStaticProxy implements Calculator {

    // 把被代理的目标对象传递进来
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("start add a = " + a + " b = " + b);
        int res = calculator.add(a,b);
        System.out.println("add result res = " + res);
        System.out.println("add method end res = " + res);
        return res;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("start substract a = " + a + " b = " + b);
        int res = calculator.sub(a,b);
        System.out.println("substract result res = " + res);
        System.out.println("substract method end res = " + res);
        return res;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("start multiply a = " + a + " b = " + b);
        int res = calculator.mul(a,b);
        System.out.println("multiply result res = " + res);
        System.out.println("multiply method end res = " + res);
        return res;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("start divide a = " + a + " b = " + b);
        int res = calculator.div(a,b);
        System.out.println("divide result res = " + res);
        System.out.println("divide method end res = " + res);
        return res;
    }

}
