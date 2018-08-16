package com.construction.decorate;

/**
 * @description: 阿华田 - 水的具体产品
 * @author: ziHeng
 * @create: 2018-08-06 13:28
 **/
public class OvaltineWater extends Water {

    //阿华田
    public void Ovaltine(){
        this.result.append("选择阿华田->");
        //阿华田初始价为10元
        this.money+=10;
    }

    @Override
    public void executeFunction() {
        this.Ovaltine();
    }

}
