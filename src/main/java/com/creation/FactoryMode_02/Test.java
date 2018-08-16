package com.creation.FactoryMode_02;

/**
 * @description: 调用者
 * @author: ziHeng
 * @create: 2018-08-02 14:35
 **/
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //多态 向下转型创建各实例工厂
        FruitFactory appleFactory = new AppleFactory();
        FruitFactory bananaFactory = new BananaFactory();
        //调用工厂方法
        appleFactory.getFruit().get();
        bananaFactory.getFruit().get();

        /*
          若要增加新的水果实例
          添加新的具体角色和具体工厂
         */

    }

}
