package com.construction.proxy.dynamicProxy;

/**
 * @description:
 * @author: ziHeng
 * @create: 2018-08-07 22:11
 **/
public class OriginHandler implements Subject{

    @Override
    public void deal(String test) {
        System.out.println("原始处理");
    }

}
