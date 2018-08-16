package com.behavior.command;


import lombok.Data;

/**
 * @description: 电脑 - receiver
 * @author: ziHeng
 * @create: 2018-08-15 18:22
 **/
@Data
public class Computer {


    private String name;

    public Computer(String name) {
        this.name = name;
    }

    //action()
    public String upKey(){
        return "上";
    }

    public String downKey(){
        return "下";
    }
}
