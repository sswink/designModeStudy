package com.construction.proxy.cglib;

/**
 * @description: 测试
 * @author: ziHeng
 * @create: 2018-08-09 14:34
 **/
public class TestCgib {

    public static void main(String[] args) {
        //创建我们的代理类
        ShopProxy Proxy = new ShopProxy();
        //获取代理对象
        Shop shop = (Shop)Proxy.getProxy(Shop.class);
        shop.deal();

    }

}
