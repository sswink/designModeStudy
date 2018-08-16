package com.construction.decorate;

/**
 * @description: 甜品装饰者
 * @author: ziHeng
 * @create: 2018-08-06 13:54
 **/
public class DessertDecorator extends WaterDecorator {

    private String dessertName;

    public DessertDecorator(Water water,String dessertName) {
        super(water);
        this.dessertName = dessertName;
    }

    private void addDessert(){
        //加入甜品
        this.water.result.append("->加入甜品:"+dessertName+" ");
        //甜品加3块钱
        this.water.money+=3;
    }

    @Override
    public void executeFunction() {
        this.addDessert();

    }
}
