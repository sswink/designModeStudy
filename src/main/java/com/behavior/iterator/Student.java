package com.behavior.iterator;

import lombok.Data;

/**
 * @description: 学生
 * @author: ziHeng
 * @create: 2018-08-13 23:29
 **/
@Data
public class Student {

    private int id;

    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
