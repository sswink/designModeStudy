package com.behavior.command;

/**
 * @description: 命令模式
 * @author: ziHeng
 * @create: 2018-08-15 18:07
 **/
public class CommandTest {

    public static void main(String[] args) {

        //计算机
        Computer computer =  new Computer("银河一号");
        //初始化调用者
        Invoker invoker = new Invoker();

        //初始化命令
        Command upCommand = new UpCommand(computer);
        Command downCommand = new DownCommand(computer);


        //客户端输入命令
        invoker.addCommand(upCommand);
        invoker.addCommand(downCommand);
        invoker.addCommand(upCommand);
        invoker.addCommand(downCommand);

        invoker.executeAllCommand();

    }

}
