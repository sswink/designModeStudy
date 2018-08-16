package com.construction.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 商店代理
 * @author: ziHeng
 * @create: 2018-08-09 14:31
 **/
public class ShopProxy implements MethodInterceptor {

    //通过Enhancer 创建代理对象
    private Enhancer enhancer = new Enhancer();

    //传入代理对象类并返回其子类(被代理对象的子类)
    public Object getProxy(Class c){
        //必须 传入需要被代理对象
        enhancer.setSuperclass(c);
        //必须 传入代理对象
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
        //代理类调用父类的方法
        proxy.invokeSuper(obj, args);
        return null;
    }
}
