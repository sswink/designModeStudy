package com.construction.flyweight;

import lombok.Data;

/**
 * @description: 车 享元基类
 * @author: ziHeng
 * @create: 2018-08-07 15:09
 **/
@Data
public class Car {

    private String name;

    private String id;

    public Car() {
    }

    public Car(String name, String id) {
        this.name = name;
        this.id = id;
    }




}
