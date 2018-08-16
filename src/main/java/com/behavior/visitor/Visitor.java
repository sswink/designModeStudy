package com.behavior.visitor;

/**
 * @description: 访问者抽象类
 * @author: ziHeng
 **/
public interface Visitor {

    void visitClassroom(Classroom classroom);

    void visitFamily(Family family);
}
