package com.construction.flyweight;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 跑车
 * @author: ziHeng
 * @create: 2018-08-07 15:10
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class SportCar extends Car {

    private String function;

    public SportCar() {
    }

    public SportCar(String name, String id, String function) {
        super(name, id);
        this.function = function;
    }
}
