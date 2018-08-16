package com.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 原型模式
 * @author: ziHeng
 * @create: 2018-08-04 19:13
 **/
public class DepthClone implements Cloneable{

    private String name;

    private int age;

    //添加了引用数据类型
    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public DepthClone clone(){
        try {
            DepthClone depthClone = (DepthClone) super.clone();
            //新的内存实例
            List<String> newFriends = new ArrayList<>();
            //读取被克隆类的数据
            //newFriends.addAll(this.friends);
            for(String friend:this.friends){
                newFriends.add(friend);
            }
            depthClone.setFriends(friends);

            return depthClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
