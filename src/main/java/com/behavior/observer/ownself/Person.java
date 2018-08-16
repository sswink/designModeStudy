package com.behavior.observer.ownself;

/**
 * @description: 人
 * @author: ziHeng
 * @create: 2018-08-06 22:06
 **/
public class Person extends ObserverAble {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.setChanged();
        this.notifyObservers(name);

        this.name = name;
    }
}
