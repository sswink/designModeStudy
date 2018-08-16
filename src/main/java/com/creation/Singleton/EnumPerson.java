package com.creation.Singleton;

/**
 * @description: 枚举式
 * @author: ziHeng
 * @create: 2018-08-04 16:17
 **/
public enum EnumPerson {

    RANDOMNAME;//随机名

    private SinglePerson singlePerson;


    EnumPerson() {
        singlePerson = new SinglePerson();
    }

    public SinglePerson getSinglePerson() {
        return singlePerson;
    }

}

//需要单例的类
class SinglePerson{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
