package com.behavior.command;

/**
 * @description: 上键 - 按钮
 * @author: ziHeng
 * @create: 2018-08-15 18:23
 **/
public class UpCommand extends Command{

    public UpCommand(Computer computer) {
        super(computer);
    }

    @Override
    public String execute() {
        //计算机执行
        return computer.upKey();
    }

}
