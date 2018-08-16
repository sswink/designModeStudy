package com.behavior.cor;

/**
 * @description: 责任链模式
 * @author: ziHeng
 * @create: 2018-08-12 14:50
 **/
public class corTest {

    public static void main(String[] args) {

        Car framework = new Framework();
        Car bottom = new Bottom();
        Car tire = new Tire();

        //设置
        framework.setNextHandle(bottom);
        bottom.setNextHandle(tire);

        framework.nextHandle();
    }

}
