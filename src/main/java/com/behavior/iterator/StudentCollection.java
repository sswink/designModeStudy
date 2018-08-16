package com.behavior.iterator;

import java.util.Iterator;

/**
 * @description: 自定义学生集合
 * @author: ziHeng
 * @create: 2018-08-13 23:30
 **/
public class StudentCollection implements CollectionContainer {

    //默认数组最大长度
    private int defaultLength = 2;

    //学生数组
    private Object[] students =new Object[defaultLength];

    //数组实际
    private int size = 0;


    //添加学生方法
    public void addStudent(Student student){
        students[size++]=student;

        //当达到了长度，需要扩展组数最大长度
        if(size >= defaultLength){
            //左移 数组长度扩大一倍
            defaultLength=defaultLength<<1;
            Object[] target = new Object[defaultLength];
            //数组复制 参数顺序:1、原始数组，2、原始数组偏移量，3、目标数组，4、目标数组偏移量，5、复制的长度
            System.arraycopy(students,0,target,0,size);
            students=target;
        }
    }

    //删除学生
    public void deleteStudent(Student student){
        //数据结构
        //数组里有值的长度
        int length = size;
        for (int i = 0; i < length; i++) {
            if(student== students[i]){
                for (int j = i; j < length; j++) {
                    students[j]= students[j+1];
                }
                students[length-1]=null;
            }
        }
        //数组下标索引
        size--;
    }

    @Override
    //实现获取迭代器方法
    public Iterator getIterator(){
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator{

        //索引
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Object next() {
            return students[index++];
        }
    }



}
