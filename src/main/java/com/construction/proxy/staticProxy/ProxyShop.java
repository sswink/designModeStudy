package com.construction.proxy.staticProxy;

/**
 * @description: 代理商店
 * @author: ziHeng
 * @create: 2018-08-07 18:30
 **/
public class ProxyShop implements Subject {

    //对真实主题的引用
    private Subject originSubject;

    public ProxyShop(Subject originSubject) {
        this.originSubject = originSubject;
    }


    @Override
    public void deal() {
        System.out.println("原始商店处理");
        originSubject.deal();

        System.out.println("代理商店处理");
    }

}
