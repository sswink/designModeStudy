package com.creation.SimpleFactoryMode_01;

/**
 * @description: 调用者
 * @author: ziHeng
 * @create: 2018-08-02 14:35
 **/
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("BananaFactory");
        apple.get();
        banana.get();
    }

}
