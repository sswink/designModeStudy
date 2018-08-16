package com.behavior.interpreter;

import java.util.Iterator;
import java.util.Map;

/**
 * @description: 终结符指示器 - 翻译器
 * @author: ziHeng
 * @create: 2018-08-11 11:53
 **/
public class TerminalExpression implements AbstractExpression{

    @Override
    public String interpreterContext(Context context) {

        //句子
        String sentence = context.getSentence();
        //语法
        Map<String, String> grammar = context.getGrammar();

        //开始翻译
        Iterator<Map.Entry<String, String>> iterator = grammar.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            //句子根据语法翻译
            sentence=sentence.replace(next.getKey(),next.getValue());
        }

        return sentence;


    }

}
