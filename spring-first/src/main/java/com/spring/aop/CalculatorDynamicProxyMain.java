package com.spring.aop;

public class CalculatorDynamicProxyMain {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        calculator.add(1,2);
        calculator.sub(1,2);
        calculator.mul(1,2);
        calculator.div(1,2);
    }

}
