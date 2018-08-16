package com.construction.decorate;

import lombok.Data;

@Data
public abstract class Water {

    public int money = 0;

    public StringBuilder result = new StringBuilder("");

    //执行功能
    public abstract void executeFunction();

}
