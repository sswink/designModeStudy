package com.behavior.visitor;

/**
 * @description: 老师
 * @author: ziHeng
 * @create: 2018-08-16 15:53
 **/
public class Teacher implements Visitor {

    @Override
    public void visitClassroom(Classroom classroom) {
        System.out.println("老师在"+classroom.getName()+"教书");
    }

    @Override
    public void visitFamily(Family family) {
        System.out.println("老师在"+family.getName()+"当家长");
    }
}
