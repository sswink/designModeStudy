package com.behavior.strategy;

/**
 * @description: 中间件
 * @author: ziHeng
 * @create: 2018-08-06 17:32
 **/
public class Context{

    private Arithmetic arithmetic;

    //构造方法注入策略类
    public Context(Arithmetic arithmetic) {
        this.arithmetic = arithmetic;
    }


    public double calculate(double num) {
        //交给策略类处理
        return arithmetic.deal(num);
    }

}
