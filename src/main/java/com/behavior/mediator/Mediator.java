package com.behavior.mediator;

/**
 * @description: 中介
 * @author: ziHeng
 * @create: 2018-08-11 15:41
 **/
public interface Mediator {

    //注册信息
    void registerInfo(People people);

    //中介处理
    String deal();


}
