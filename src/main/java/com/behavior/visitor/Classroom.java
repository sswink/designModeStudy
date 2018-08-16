package com.behavior.visitor;

import lombok.Data;

/**
 * @description: 课室
 * @author: ziHeng
 * @create: 2018-08-16 15:10
 **/
@Data
public class Classroom implements Element {

    String name;

    public Classroom(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitClassroom(this);
    }

}
