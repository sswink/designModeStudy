package com.behavior.command;

/**
 * @description: 下键 - 按钮
 * @author: ziHeng
 * @create: 2018-08-15 18:23
 **/
public class DownCommand extends Command{


    public DownCommand(Computer computer) {
        super(computer);
    }

    @Override
    public String execute() {
        //计算机执行
        return computer.downKey();
    }

}
