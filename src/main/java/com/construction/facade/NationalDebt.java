package com.construction.facade;

import java.util.Random;

/**
 * @description: 国债
 * @author: ziHeng
 * @create: 2018-08-09 17:12
 **/
public class NationalDebt {


    public static float buyNationalDebt(float money){
        System.out.println("买国债:"+money+"元");
        //返回获利
        return new Random().nextFloat();
    }

}
