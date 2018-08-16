package com.behavior.visitor;

/**
 * @description: 访问者模式测试
 * @author: ziHeng
 * @create: 2018-08-16 15:59
 **/
public class VisitorTest {

    public static void main(String[] args) {
        //初始化访问者visitor
        Visitor teacher = new Teacher();
        Visitor student = new Student();

        //初始化被访问元素Element
        Element classroom = new Classroom("课室");
        Element family = new Family("家");

        //访问者 访问元素
        classroom.accept(teacher);
        classroom.accept(student);

        System.out.println();
        family.accept(teacher);
        family.accept(student);


    }

}
