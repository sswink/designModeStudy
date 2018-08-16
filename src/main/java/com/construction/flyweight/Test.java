package com.construction.flyweight;

/**
 * @description: 测试
 * @author: ziHeng
 * @create: 2018-08-07 15:33
 **/
public class Test {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getCar("1",SportCar.class);
        Car car2 = carFactory.getCar("1",SportCar.class);

        System.out.println(car1==car2);

    }

}
