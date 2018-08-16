package com.construction.proxy.staticProxy;

/**
 * @description: 静态代理测试类
 * @author: ziHeng
 * @create: 2018-08-07 18:25
 **/
public class StaticProxyTest {

    public static void main(String[] args) {
        OriginShop originShop = new OriginShop();
        ProxyShop proxyShop = new ProxyShop(originShop);
        proxyShop.deal();
    }


}
