package com.behavior.cor;

/**
 * @description: 汽车框架
 * @author: ziHeng
 * @create: 2018-08-12 15:00
 **/
public class Framework extends Car {

    @Override
    public void nextHandle() {
        System.out.print("拼装框架");
        if(car!=null){
            car.nextHandle();
        }
    }
}
