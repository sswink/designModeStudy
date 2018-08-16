package com.creation.Singleton;

/**
 * @description: 双重检查单例模式
 * @author: ziHeng
 * @create: 2018-08-04 15:02
 **/
public class DoubleCheckPerson {

    private static DoubleCheckPerson lazyPerson;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private DoubleCheckPerson() {
    }

    public static DoubleCheckPerson getLazyPerson() {

            if(lazyPerson==null) {//一重检查
                synchronized (DoubleCheckPerson.class) {
                    if(lazyPerson==null){ //二重检查
                        lazyPerson = new DoubleCheckPerson();
                    }
                }
            }
            return lazyPerson;
        }
}
