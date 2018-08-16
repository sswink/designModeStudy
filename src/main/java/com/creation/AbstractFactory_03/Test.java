package com.creation.AbstractFactory_03;

/**
 * @description: 调用者
 * @author: ziHeng
 * @create: 2018-08-02 22:04
 **/
public class Test {

    public static void main(String[] args) {
        FruitFactory northFruitFactory = new NorthFruitFactory();
        northFruitFactory.getApple().get();
        northFruitFactory.getBanana().get();
    }

}
