package com.creation.Singleton;

/**
 * @description: 恶汉式单例模式:比较耗费应用初始时的资源
 * @author: ziHeng
 * @create: 2018-08-04 14:59
 **/
public class HungryPerson {

    private static final HungryPerson hungryPerson = new HungryPerson();

    private String name;

    private HungryPerson() {
    }

    public static HungryPerson getHungryPerson() {
        return hungryPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
