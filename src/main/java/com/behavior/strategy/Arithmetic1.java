package com.behavior.strategy;

import lombok.Data;

/**
 * @description: 算法1
 * @author: ziHeng
 * @create: 2018-08-06 17:24
 **/
@Data
public class Arithmetic1 implements Arithmetic{

    @Override
    public double deal(double num) {
       return num*0.8;
    }

}
