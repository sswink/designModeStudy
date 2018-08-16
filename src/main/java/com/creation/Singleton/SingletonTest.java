package com.creation.Singleton;

/**
 * @description: 单例模式测试
 * @author: ziHeng
 * @create: 2018-08-04 15:01
 **/
public class SingletonTest {

    public static void main(String[] args) {
        SinglePerson singlePerson1 = EnumPerson.RANDOMNAME.getSinglePerson();
        SinglePerson singlePerson2 = EnumPerson.RANDOMNAME.getSinglePerson();
        singlePerson1.setName("1");
        singlePerson2.setName("2");
        System.out.println(singlePerson1.getName());
        System.out.println(singlePerson2.getName());
    }





}
