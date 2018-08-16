package com.behavior.observer.ownself;

/**
 * @description: 简单观察者
 * @author: ziHeng
 * @create: 2018-08-06 22:05
 **/
public class SimpleObserver implements Observer {

    @Override
    public void update(Observer o,Object arg){
        System.out.println(o);
        System.out.println(arg);
        System.out.println("有变化");
    }
}
