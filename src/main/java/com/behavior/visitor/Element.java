package com.behavior.visitor;

/**
 * @description: 被访问的抽象元素
 * @author: ziHeng
 **/
public interface Element {

    void accept(Visitor visitor);

}
