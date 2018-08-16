package com.behavior.command;

/**
 * @description: 命令
 * @author: ziHeng
 * @create: 2018-08-15 18:21
 **/
public abstract class Command {

    protected Computer computer;

    public Command(Computer computer) {
        this.computer = computer;
    }

    //计算机执行
    abstract String execute();

}
