package com.behavior.observer.ownself;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 可观察的
 * @author: ziHeng
 * @create: 2018-08-06 21:58
 **/
public class ObserverAble {

    private List<Observer> observerList;

    public ObserverAble() {
        observerList = new ArrayList<>();
    }

    private boolean isChanged = false;

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void notifyObservers(){
        this.notifyObservers(null);
    }

    public void notifyObservers(String args){
        if(isChanged){
            for(Observer observer:observerList){
                observer.update(observer,args);
            }
        }
    }

    public void setChanged(){
        this.isChanged = true;
    }


}
