package com.behavior.memento;

import java.util.*;

/**
 * @description: 载入存档列表 - 单例
 * @author: ziHeng
 * @create: 2018-08-14 20:24
 **/
public class Caretaker {

    private static Map<String,Memento> mementoMap;

    public static Map<String,Memento> getMementoMap(){
        if(mementoMap ==null){
            synchronized (Caretaker.class){
                if(mementoMap ==null){
                    mementoMap = new HashMap<>();
                }
            }
        }
        return mementoMap;
    }
    
}
