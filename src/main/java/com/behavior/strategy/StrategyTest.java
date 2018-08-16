package com.behavior.strategy;

/**
 * @description: 策略模式测试
 * @author: ziHeng
 * @create: 2018-08-06 17:28
 **/
public class StrategyTest {

    public static void main(String[] args) {
        double num = 100;

        Context context = new Context(new Arithmetic2());

        double calculate = context.calculate(num);

        System.out.println(calculate);
    }

}
