package com.construction.bridge;

/**
 * @description: 桥接模式
 * @author: ziHeng
 * @create: 2018-08-10 14:40
 **/
public class BridgeTest {

    public static void main(String[] args) {
        Engine engine = new Engine2018();

        Car car = new SportCar(engine);
        //构建
        car.build();
    }

}
