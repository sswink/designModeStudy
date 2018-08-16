package com.construction.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * @description: 测试
 * @author: ziHeng
 * @create: 2018-08-08 19:15
 **/
public class TestHandler implements Subject {

    public TestHandler(InvocationHandler invocationHandler) {
    }

    @Override
    public void deal(String s) {
        System.out.println("为什么牛");
    }


}
