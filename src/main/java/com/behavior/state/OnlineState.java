package com.behavior.state;

/**
 * @description: 状态:在线
 * @author: ziHeng
 * @create: 2018-08-15 15:00
 **/
public class OnlineState implements State{

    @Override
    public void handle(Man man) {
        //上线次数加一
        int onlineNum = man.getOnlineNum();
        man.setOnlineNum(++onlineNum);
        System.out.println(man.getName()+" - 在线中");
    }

}
