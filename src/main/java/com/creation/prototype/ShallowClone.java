package com.creation.prototype;

/**
 * @description: 原型模式
 * @author: ziHeng
 * @create: 2018-08-04 19:13
 **/
public class ShallowClone implements Cloneable{

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public ShallowClone clone(){
        try {
            return (ShallowClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
