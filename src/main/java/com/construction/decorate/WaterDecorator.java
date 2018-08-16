package com.construction.decorate;

/**
 * @description: 水抽象装饰器
 * @author: ziHeng
 * @create: 2018-08-06 13:41
 **/
public abstract class WaterDecorator extends Water {

    protected Water water;

    public WaterDecorator(Water water) {
        this.water = water;
    }

    @Override
    public abstract void executeFunction();
}
