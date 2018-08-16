package com.behavior.observer.official;

import java.util.Observable;

/**
 * @description: 人
 * @author: ziHeng
 * @create: 2018-08-06 22:06
 **/
public class Person extends Observable {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.setChanged(); //需设置已改变
        this.notifyObservers(name); //通知所有观察者

        this.name = name;
    }
}
