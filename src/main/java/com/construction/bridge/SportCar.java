package com.construction.bridge;

/**
 * @description: 跑车
 * @author: ziHeng
 * @create: 2018-08-10 14:43
 **/
public class SportCar extends Car {

    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void build() {
        System.out.println("桥的一边：跑车");
        System.out.println("------");
        System.out.println(this.getEngine().buildEngine());
    }

}
