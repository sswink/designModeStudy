package com.behavior.memento;

import java.util.Date;
import java.util.Map;

/**
 * @description: 备忘录模式
 * @author: ziHeng
 * @create: 2018-08-14 19:37
 **/
public class MementoTest {

    public static void main(String[] args) {

        Map<String, Memento> mementoMap = Caretaker.getMementoMap();

        //存档记录1
        GameRecord gameRecord1 = new GameRecord(100,"生存","01-01 01:31");
        gameRecord1.createMemento();
        ////存档记录2
        GameRecord gameRecord2 = new GameRecord(200,"生存","10-03 02:30");
        gameRecord2.createMemento();

        //列出存档信息
        for(Memento memento:mementoMap.values()){
            System.out.println("存档信息:"+memento);
        }

        System.out.println();

        gameRecord1.setStatus("死亡");
        System.out.println("死亡后:"+gameRecord1);
        //恢复存档
        //获取存档
        Memento memento = mementoMap.get("01-01 01:31");
        gameRecord1.mementoRollBack(memento);
        System.out.println("恢复存档信息:"+gameRecord1);







    }

}
