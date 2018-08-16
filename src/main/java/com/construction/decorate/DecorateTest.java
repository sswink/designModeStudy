package com.construction.decorate;

/**
 * @description: 装饰器模式测试
 * @author: ziHeng
 * @create: 2018-08-06 13:49
 **/
public class DecorateTest {

    public static void main(String[] args) {
        //选择阿华田
        Water water = new OvaltineWater();
        water.executeFunction();
        System.out.println(water.getResult());//打印结果
        System.out.println("------");
        //冰的选择
        Water iceDecorator = new IceDecorator(water,"少冰");
        iceDecorator.executeFunction();
        System.out.println(water.getResult());//打印结果
        System.out.println("------");
        //甜品的选择
        Water dessertDecorator = new DessertDecorator(water,"布丁");
        dessertDecorator.executeFunction();

        //总价格
        System.out.println("总价:"+water.getMoney());
        System.out.println("最后结果:"+water.getResult());
    }

}
