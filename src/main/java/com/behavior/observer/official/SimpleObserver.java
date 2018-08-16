package com.behavior.observer.official;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 简单观察者
 * @author: ziHeng
 * @create: 2018-08-06 22:12
 **/
public class SimpleObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        System.out.println(arg);
    }

}
