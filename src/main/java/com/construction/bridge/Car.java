package com.construction.bridge;

import lombok.Data;

/**
 * @description: 车
 * @author: ziHeng
 * @create: 2018-08-10 14:42
 **/
@Data
public abstract class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void build();

}
