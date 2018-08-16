package com.behavior.cor;

/**
 * @description: 汽车底部
 * @author: ziHeng
 * @create: 2018-08-12 15:00
 **/
public class Bottom extends Car{

    @Override
    public void nextHandle() {
        System.out.print("->拼装底部");
        if(car!=null){
            car.nextHandle();
        }
    }
}
