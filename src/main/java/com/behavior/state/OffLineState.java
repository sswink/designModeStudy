package com.behavior.state;

/**
 * @description: 状态:离线
 * @author: ziHeng
 * @create: 2018-08-15 15:00
 **/
public class OffLineState implements State{

    @Override
    public void handle(Man man) {
        System.out.println(man.getName()+" - 离线中");
    }

}
