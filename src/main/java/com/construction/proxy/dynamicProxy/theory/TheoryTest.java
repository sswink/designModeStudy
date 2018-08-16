package com.construction.proxy.dynamicProxy.theory;

import com.construction.proxy.dynamicProxy.OriginHandler;
import com.construction.proxy.dynamicProxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 原理学习
 * @author: ziHeng
 * @create: 2018-08-09 11:51
 **/
public class TheoryTest {

    public static void main(String[] args) {
        //这段可以在磁盘中生成编译后的代理类，通过反编译可以代理类的真面目
         System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

    }

}
