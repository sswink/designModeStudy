package com.behavior.templateMethod;

/**
 * @description: 实现类 - 跑车
 * @author: ziHeng
 * @create: 2018-08-14 14:31
 **/
public class SportCar extends AbstractCar {

    @Override
    public void frame() {
        System.out.println("跑车架构");
    }

    @Override
    public void bottom() {
        System.out.println("跑车底部");
    }

    @Override
    public void tire() {
        System.out.println("跑车轮胎");
    }
}
