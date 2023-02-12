package com.spring.annoaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class LogAspect {

    /**
     *
     * 设置切入点和通知类型
     * 通知类型：
     * 前置 @Befor(value="切入点表达式配置切入点")
     * 返回 @AfterReturning
     * 异常 @AfterThrowing
     * 后置 @After
     * 环绕 @Around
     *
     */
//    @Before(value = "execution(public * com.spring.annoaop.Calculator.*(..))")
    @Before(value = "execution(public int com.spring.annoaop.Calculator.*(int, int))")
    public void beforeMethod(){
        System.out.println("前置通知 --> 调用方法");
    }

}
