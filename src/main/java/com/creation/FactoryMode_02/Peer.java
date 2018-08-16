package com.creation.FactoryMode_02;

/**
 * @description: 具体产品角色-梨子
 * @author: ziHeng
 * @create: 2018-08-02 16:27
 **/
public class Peer implements Fruit{

    @Override
    public void get() {
        System.out.println("得到雪梨");
    }

}
