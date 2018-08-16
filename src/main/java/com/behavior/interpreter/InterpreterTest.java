package com.behavior.interpreter;

/**
 * @description: 解释器测试
 * @author: ziHeng
 * @create: 2018-08-11 12:15
 **/
public class InterpreterTest {

    public static void main(String[] args) {
        //将翻译的句子
        String sentence = "I like GuangZhou and banana";
        Context context = new Context(sentence);

        //文法设置
        context.addWord("banana","香蕉");
        context.addWord("interpreter","解释器");
        context.addWord("GuangZhou","广州");

        AbstractExpression terminalExpression = new TerminalExpression();

        //获得翻译结果
        String result = terminalExpression.interpreterContext(context);
        System.out.println(result);
    }

}
