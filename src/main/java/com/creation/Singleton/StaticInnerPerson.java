package com.creation.Singleton;

/**
 * @description: 静态内部类单例
 * @author: ziHeng
 * @create: 2018-08-04 17:10
 **/
public class StaticInnerPerson {

    private StaticInnerPerson() {}

    //静态内部类
    private static class StaticInnerClass {

        //静态成员变量(单例)
        private static final StaticInnerPerson staticInnerPerson = new StaticInnerPerson();

    }

    public static StaticInnerPerson getInstance() {
        return StaticInnerClass.staticInnerPerson;
    }

}
