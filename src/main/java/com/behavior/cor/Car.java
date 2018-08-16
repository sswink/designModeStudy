package com.behavior.cor;

/** 
  * @Description: 抽象处理者
  * @Author: ziHeng
  * @Date: 2018/8/12 5:53 PM
  */
public abstract class Car{

    //对自身的引用
    protected Car car;

    public void setNextHandle(Car car){
        this.car = car;
    }

    public abstract void nextHandle();
}
