package com.creation.Singleton;

/**
 * @description: 懒汉式单例模式 多线程情况不能保证返回同一对象
 * @author: ziHeng
 * @create: 2018-08-04 15:02
 **/
public class LazyPerson {

    private static LazyPerson lazyPerson;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private LazyPerson() {
    }

    public static LazyPerson getLazyPerson() {
            if(lazyPerson==null) {
                lazyPerson = new LazyPerson();
            }
            return lazyPerson;
        }
}
