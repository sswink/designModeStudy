package com.construction.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 树枝
 * @author: ziHeng
 * @create: 2018-08-09 20:14
 **/
public class Branch extends Tree{

    protected String name;

    List<Leaf> leafList;

    public Branch(String name) {
        this.name = name;
        leafList= new ArrayList<>();
    }

    public void add(Leaf leaf){
        leafList.add(leaf);
    }

    public void remove(Leaf leaf){
        leafList.remove(leaf);
    }

    public Object get(int leafIndex){
        return leafList.get(leafIndex);
    }

    //展示其所有分支
    @Override
    public void display() {

        System.out.println("树枝名字:"+name);
        for(Leaf leaf:leafList){
            leaf.display();
        }
    }

}
