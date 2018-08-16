package com.creation.FactoryMode_02;

/**
 * @description: 苹果工厂
 * @author: ziHeng
 * @create: 2018-08-02 18:12
 **/
public class AppleFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
