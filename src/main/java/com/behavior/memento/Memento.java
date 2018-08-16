package com.behavior.memento;

import lombok.Data;

/**
 * @description: 存档
 * @author: ziHeng
 * @create: 2018-08-14 19:38
 **/
@Data //lombok插件 get/set方法
public class Memento {

    //战斗力
    private int fightingCapacity;

    //状态
    private String status;

    //存档日期
    private String time;

    public Memento(int fightingCapacity, String status, String time) {
        this.fightingCapacity = fightingCapacity;
        this.status = status;
        this.time = time;
    }



}
