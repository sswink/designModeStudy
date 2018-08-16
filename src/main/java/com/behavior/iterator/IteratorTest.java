package com.behavior.iterator;

import java.util.Iterator;

/**
 * @description: 迭代模式测试
 * @author: ziHeng
 * @create: 2018-08-13 22:43
 **/
public class IteratorTest {

    public static void main(String[] args) {
        Student student1 = new Student(1,"张一");
        Student student2 = new Student(2,"李二");
        Student student3 = new Student(3,"王三");


        StudentCollection studentCollection = new StudentCollection();
        studentCollection.addStudent(student1);
        studentCollection.addStudent(student2);
        studentCollection.addStudent(student3);

        studentCollection.deleteStudent(student2);

        Iterator iterator = studentCollection.getIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}
