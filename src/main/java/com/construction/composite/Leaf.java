package com.construction.composite;

/**
 * @description: 树叶
 * @author: ziHeng
 * @create: 2018-08-09 20:14
 **/
public class Leaf extends Tree{

    protected String name;

    public Leaf(String name) {
        this.name = name;
    }

    //展示其名字
    @Override
    public void display() {
        System.out.println("叶子名字:"+name);
    }
}
