package com.behavior.mediator;

import lombok.Data;

/**
 * @description: 抽象
 * @author: ziHeng
 * @create: 2018-08-11 15:41
 **/

@Data//Data插件
public abstract class People {

    //人名
    private String name;

    //可接受价格
    private int acceptablePrice;

    //中介
    private Mediator mediator;

    public People(String name, int acceptablePrice) {
        this.name = name;
        this.acceptablePrice = acceptablePrice;
    }

    //寻找中介
    public abstract void findMediator(Mediator mediator);

    
}
