package com.creation.FactoryMode_02;


/**
 * @description: 具体产品角色-香蕉
 * @author: ziHeng
 * @create: 2018-08-02 14:31
 **/
public class BananaFactory implements FruitFactory{

    @Override
    public Fruit getFruit(){
        return new Banana();
    }

}
