package com.behavior.templateMethod;

/**
 * @description: 抽象车
 * @author: ziHeng
 * @create: 2018-08-14 14:29
 **/
public abstract class AbstractCar {

    //汽车轮廓架构
    public abstract void frame();

    //底部
    public abstract void bottom();

    //轮胎
    public abstract void tire();


    //提供模板方法
    public void templateMethod(){
        //调用自身抽象方法
        this.frame();
        this.bottom();
        this.tire();
    }

}
