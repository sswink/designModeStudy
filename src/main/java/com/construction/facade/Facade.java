package com.construction.facade;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * @description: facade - 类似功能的集群，这里模仿基金
 * @author: ziHeng
 * @create: 2018-08-09 16:45
 **/
public class Facade {

    /**
     * @Description: 购买基金 "基金会"随机执行购买方案
    */
    public float buyFund(float money){

        String[] fundMethodNames = {"fund1","fund2"};
        Class facade = this.getClass();
        int index = new Random().nextInt(fundMethodNames.length);
        Object invoke = null;
        try {
            //动态执行方法
            Method method = facade.getMethod(fundMethodNames[index], float.class);
            System.out.print("该基金将选择->");
            invoke = method.invoke(new Facade(), money);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (float) invoke;
    }

    //基金内部方案1
    public float fund1(float money){
        System.out.println("方案1:股票和外汇");
        float profit;
        //购买股票
        int stockMoney = new Random().nextInt((int) (money / 2));
        float stockProfit = Stock.buyStock(stockMoney);
        //购买外汇
        int foreignExchangeMoney = (int) (money-stockMoney);
        float foreignExchangeProfit = ForeignExchange.buyForeignExchange(foreignExchangeMoney);

        //计算获益
        profit=stockProfit+foreignExchangeProfit;
        return profit;
    }

    //基金内部方案2
    public float fund2(float money){
        System.out.println("方案2:外汇和国债");
        float profit;
        //购买外汇
        int foreignExchangeMoney = new Random().nextInt((int) (money / 2));
        float foreignExchangeProfit = ForeignExchange.buyForeignExchange(foreignExchangeMoney);
        //购买国债
        int nationMoney = (int) (money-foreignExchangeMoney);
        float nationProfit = NationalDebt.buyNationalDebt(nationMoney);


        //计算获益
        profit=foreignExchangeProfit+nationProfit;
        return profit;
    }

}
