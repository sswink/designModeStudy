package com.behavior.interpreter;

/**
 * @description: 非终结符指示器
 * @author: ziHeng
 * @create: 2018-08-11 11:55
 **/
public class NonInterpreterExpression implements AbstractExpression{

    //另一个解释器
    private AbstractExpression anotherExpression;

    public NonInterpreterExpression(AbstractExpression anotherExpression) {
        this.anotherExpression = anotherExpression;
    }

    @Override
    public String interpreterContext(Context context) {

        return null;
    }
}
