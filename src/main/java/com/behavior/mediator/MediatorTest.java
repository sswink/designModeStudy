package com.behavior.mediator;

/**
 * @description: 中介者模式测试
 * @author: ziHeng
 * @create: 2018-08-11 14:33
 **/
public class MediatorTest {

    public static void main(String[] args) {

        //租赁中介
        Mediator rentMediator = new RentMediator();

        //游客
        Visitors visitors = new Visitors("小明",300);
        //寻找中介找房子
        visitors.findMediator(rentMediator);
        visitors.findHouse();

        //房东
        Landlord landlord = new Landlord("房东A",300);
        //寻找中介出租房子
        landlord.findMediator(rentMediator);
        landlord.rentOutHouse();

        //中介处理
        String result = rentMediator.deal();
        System.out.println("处理结果:"+result);


    }

}
