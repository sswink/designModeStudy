package com.behavior.cor;

/**
 * @description: 汽车轮胎
 * @author: ziHeng
 * @create: 2018-08-12 15:00
 **/
public class Tire extends Car{

    @Override
    public void nextHandle() {
        System.out.println("拼装轮胎");
        if(car!=null){
            car.nextHandle();
        }
    }

}
