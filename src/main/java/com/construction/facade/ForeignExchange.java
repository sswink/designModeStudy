package com.construction.facade;

import java.util.Random;

/**
 * @description: 外汇
 * @author: ziHeng
 * @create: 2018-08-09 17:12
 **/
public class ForeignExchange {


    public static float buyForeignExchange(float money){
        System.out.println("买外汇:"+money+"元");
        //返回获利
        return new Random().nextFloat();
    }

}
