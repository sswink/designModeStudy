package com.creation.AbstractFactory_03;

/**
 * @description: 北方苹果工厂
 * @author: ziHeng
 * @create: 2018-08-02 21:53
 **/
public class NorthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
