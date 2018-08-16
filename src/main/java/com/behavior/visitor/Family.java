package com.behavior.visitor;

import lombok.Data;

/**
 * @description: 家庭
 * @author: ziHeng
 * @create: 2018-08-16 16:41
 **/
@Data
public class Family implements Element {

    private String name;

    public Family(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFamily(this);
    }
}
