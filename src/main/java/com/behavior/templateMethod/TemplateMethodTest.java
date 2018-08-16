package com.behavior.templateMethod;

/**
 * @description: 模板方法测试
 * @author: ziHeng
 * @create: 2018-08-14 14:25
 **/
public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractCar sportCar = new SportCar();
        sportCar.templateMethod();
    }

}
