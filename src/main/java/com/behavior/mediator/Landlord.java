package com.behavior.mediator;

/**
 * @description: 房东
 * @author: ziHeng
 * @create: 2018-08-11 15:51
 **/
public class Landlord extends People {

    public Landlord(String name, int acceptablePrice) {
        super(name, acceptablePrice);
    }

    //出租房子
    public void rentOutHouse(){
        //注册信息
        Mediator mediator = this.getMediator();
        mediator.registerInfo(this);
        //这里可以注册后寻求中介马上处理,这里就不弄了
        //mediator.deal();
    }

    @Override
    public void findMediator(Mediator mediator) {
        this.setMediator(mediator);
    }
}
