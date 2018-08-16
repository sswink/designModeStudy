package com.construction.decorate;

/**
 * @description: 冰的装饰者
 * @author: ziHeng
 * @create: 2018-08-06 13:45
 **/
public class IceDecorator extends WaterDecorator {

    //加冰的量
    private String iceScale;

    public IceDecorator(Water water,String iceScale) {
        super(water);
        this.iceScale=iceScale;
    }

    //冰
    private void addIce() {
        //冰
        this.water.result.append("冰:"+iceScale+" ");
        //加一块钱
        this.water.money+=1;
    }

    @Override
    public void executeFunction() {
        this.addIce();
    }
}
