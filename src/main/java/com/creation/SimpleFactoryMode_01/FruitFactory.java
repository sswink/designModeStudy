package com.creation.SimpleFactoryMode_01;

/**
 * @description: 工厂角色-水果工厂
 * @author: ziHeng
 * @create: 2018-08-02 14:32
 **/
public class FruitFactory {

    public static Fruit getFruit(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //降低扩展性，但增加了容错率适用性
        if("Apple".equalsIgnoreCase(type)){
            return Apple.class.newInstance();
        }else if("BananaFactory".equalsIgnoreCase(type)){
            return Banana.class.newInstance();
        }else {
            System.out.println("没有实例");
            return null;
        }


    }

}
