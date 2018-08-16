package com.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 原型
 * @author: ziHeng
 * @create: 2018-08-04 19:15
 **/
public class Test {

    public static void main(String[] args) {
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setAge(1);
        shallowClone.setName("张");
        List<String> friends = new ArrayList<>();
        friends.add("1");
        friends.add("2");
        System.out.println(friends);


        ShallowClone clone = shallowClone.clone();

    }

}
