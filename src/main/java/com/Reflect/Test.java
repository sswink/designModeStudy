package com.Reflect;

import java.lang.reflect.Method;

/**
 * @description: 反射测试
 * @author: ziHeng
 * @create: 2018-08-03 15:29
 **/
public class Test {


    public static void main(String[] args) {
        String[][] test = {{"123"},{"123","2312"}};
        Class cl = test.getClass();
        System.out.println(cl.getName());
        System.out.println(cl.getComponentType());
        int dimensions = 0;
        while (cl.isArray()) {
            dimensions++;
            cl = cl.getComponentType();
            System.out.println(cl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cl.getName());
        for (int i = 0; i < dimensions; i++) {
            sb.append("[]");
        }
        System.out.println(sb);


    }

}
