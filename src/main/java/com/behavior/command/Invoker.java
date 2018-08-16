package com.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 调用者 - 真正执行命令的对象
 * @author: ziHeng
 * @create: 2018-08-15 19:10
 **/
public class Invoker {

    private List<Command> commandList;

    public Invoker() {
        this.commandList = new ArrayList<>();
    }

    //添加命令
    public void addCommand(Command command){
        commandList.add(command);
    }

    //删除命令
    public void deleteCommand(Command command){
        commandList.remove(command);
    }

    //执行所有命令
    public void executeAllCommand(){
        //对行为进行记录
        StringBuilder combineKey = new StringBuilder();
        for (Command command:commandList){
            //命令执行
            combineKey.append(command.execute());
        }
        //对执行过的命令进行判断
        String combineString = combineKey.toString();
        switch (combineString){
            case "上上下下":
                System.out.println("计算机名:"+commandList.iterator().next().computer.getName());
                System.out.println(combineString+" - 发动联合技:背摔");break;
            case "上下上下":
                System.out.println("计算机名:"+commandList.iterator().next().computer.getName());
                System.out.println(combineString+" - 发动联合技:洞洞波");break;
                default:
                    System.out.println("该按键组合没有联合技");
        }

        //清除命令
        commandList.clear();
    }

}
