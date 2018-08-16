package com.behavior.observer.official;


import java.util.Observer;

/**
 * @description: 观察者测试
 * @author: ziHeng
 * @create: 2018-08-06 22:04
 **/
public class ObserverTest {

    public static void main(String[] args) {
        Observer observer1  = new SimpleObserver();
        Observer observer2  = new SimpleObserver();


        Person person = new Person();
        person.addObserver(observer1);
        person.addObserver(observer2);

        person.setName("ziHeng");

    }

}
