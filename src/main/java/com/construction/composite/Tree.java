package com.construction.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Tree
 * @author: ziHeng
 * @create: 2018-08-09 20:10
 **/
public class Tree {

    List<Branch> branchList;

    public Tree() {
        branchList = new ArrayList<>();
    }

    public void add(Branch branch){
        branchList.add(branch);
    }

    public void remove(Branch branch){
        branchList.remove(branch);
    }

    public Object get(int branchIndex){
        return branchList.get(branchIndex);
    }


    public void display(){
        //展示其所有分支
        for(Branch branch:branchList){
            branch.display();
        }
    }




}
