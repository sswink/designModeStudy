package com.behavior.state;

/**
 * @description: 状态模式
 * @author: ziHeng
 * @create: 2018-08-15 14:33
 **/
public class StateTest {

    public static void main(String[] args) {
        Man man = new Man("张三");
        //第一次上线
        man.setStatus("on");
        //下线
        man.setStatus("off");
        //又上线
        man.setStatus("on");

        //查看上线次数
        System.out.println("用户:"+man.getName()+" 共上线"+man.getOnlineNum()+"次");



    }

}
