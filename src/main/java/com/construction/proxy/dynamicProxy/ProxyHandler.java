package com.construction.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: jdk代理处理
 * @author: ziHeng
 * @create: 2018-08-07 22:06
 **/
public class ProxyHandler implements InvocationHandler {

    private Subject originHandler;

    public ProxyHandler(Subject originHandler) {
        this.originHandler = originHandler;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //原始处理
        //originHandler.deal();
        System.out.println("当前代理的方法名:"+method.getName());
        for(Object o:args){
            System.out.println(o);
        }
        method.invoke(originHandler,args);


        return null;
    }

}
