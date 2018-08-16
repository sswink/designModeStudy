package com.behavior.state;


import lombok.Data;

/**
 * @description: 人
 * @author: ziHeng
 * @create: 2018-08-15 15:07
 **/
@Data
public class Man {

    private String name;

    //上线次数
    private int onlineNum;

    private String status;

    //状态抽象类，具体行为
    private State state;


    public Man(String name) {
        this.onlineNum = 0;
        this.name = name;
        //初始状态为离线
        this.state = new OffLineState();
    }

    //改变状态
    public void setStatus(String status) {
        if("on".equals(status)){
            state = new OnlineState();
        }else if("off".equals(status)){
            state = new OffLineState();
        }else {
            System.out.println("没有该变化的状态处理类:"+status+" 默认为离线");
            state = new OffLineState();
        }
        state.handle(this);
    }
}
