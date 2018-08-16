package com.construction.facade;

/**
 * @description: 外观模式测试
 * @author: ziHeng
 * @create: 2018-08-09 16:42
 **/
public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();
        //购买基金，客户对基金内部操作完全不知情
        float money = 200;
        float profit = facade.buyFund(money);
        System.out.println("购买基金:"+money+"元,当天获利:"+profit+"元");
    }

}
