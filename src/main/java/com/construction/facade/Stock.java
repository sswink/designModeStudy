package com.construction.facade;

import java.util.Random;

/**
 * @description: 股票
 * @author: ziHeng
 * @create: 2018-08-09 16:47
 **/
public class Stock {

    public static float buyStock(float money){
        System.out.println("买股票:"+money+"元");

        //返回获利
        return new Random().nextFloat();
    }

}
