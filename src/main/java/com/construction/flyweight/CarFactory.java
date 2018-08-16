package com.construction.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 工厂
 * @author: ziHeng
 * @create: 2018-08-07 15:13
 **/
public class CarFactory {

    //享元模式就是靠一个 Map收集所有对象，类似ThreadLocal
    private Map<String,Car> carMap;

    public CarFactory() {
        carMap = new HashMap<>();
    }

    public Car getCar(String id,Class carClass){
        Car car = carMap.get(id);
        if(car==null){
            try {
                //建立实例
                Car newCar = (Car) carClass.newInstance();
                newCar.setId(id);
                if(carClass==SportCar.class){
                    //向上转型
                    SportCar sportCar = (SportCar)newCar;
                    //成员变量赋值
                    sportCar.setFunction("跑车");
                    newCar.setName("跑车");
                }else {
                    System.out.println("没有更多车型");
                }
                //存入Map
                carMap.put(id,newCar);
                return newCar;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return car;

    }

}
