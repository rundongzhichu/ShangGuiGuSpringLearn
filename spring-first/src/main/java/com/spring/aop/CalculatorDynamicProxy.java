package com.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorDynamicProxy implements InvocationHandler {

    /**
     * 代理类中的真实对象
     */
    private final Object target;


    public CalculatorDynamicProxy(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start " + method.getName() + " a = " + args[0] + " b = " + args[1]);
        int res = (int) method.invoke(target, args);
        System.out.println(method.getName() + " result res = " + res);
        System.out.println(method.getName() + " method end res = " + res);
        return res;
    }



}
