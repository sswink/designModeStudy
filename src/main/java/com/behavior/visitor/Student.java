package com.behavior.visitor;

/**
 * @description: 学生
 * @author: ziHeng
 * @create: 2018-08-16 15:53
 **/
public class Student implements Visitor {

    @Override
    public void visitClassroom(Classroom classroom) {
        System.out.println("学生在"+classroom.getName()+"上课");
    }

    @Override
    public void visitFamily(Family family) {
        System.out.println("学生在"+family.getName()+"当孩子");
    }

}
