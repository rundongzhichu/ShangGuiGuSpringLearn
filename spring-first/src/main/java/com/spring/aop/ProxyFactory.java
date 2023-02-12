package com.spring.aop;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // return proxy object

    /**
     * Proxy.newProxyInstance() 方法
     *
     * 三个参数：
     * 1. classLoader 加载动态生成代理类的加载器
     * 2. class[]: 目标对象实现的所有的接口类
     * 3. invocationHandler： 设置代理对象调用目标对象方法的过程
     *
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new CalculatorDynamicProxy(target));
    }

}
