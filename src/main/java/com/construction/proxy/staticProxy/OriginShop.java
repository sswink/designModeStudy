package com.construction.proxy.staticProxy;

/**
 * @description: 商店
 * @author: ziHeng
 * @create: 2018-08-07 18:27
 **/
public class OriginShop implements Subject{

    @Override
    public void deal() {
        System.out.println("原始商店处理");
    }
}
