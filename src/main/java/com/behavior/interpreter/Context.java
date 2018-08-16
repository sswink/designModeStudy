package com.behavior.interpreter;


import java.util.HashMap;
import java.util.Map;

/**
 * @description: 文法
 * @author: ziHeng
 * @create: 2018-08-11 11:56
 **/
public class Context {

    //语法
    private Map<String,String> grammar;

    //句子
    private String sentence;


    public Context(String sentence) {
        grammar = new HashMap<>();
        this.sentence= sentence;
    }

    public void addWord(String english,String chinese){
        grammar.put(english,chinese);
    }

    public String getWord(String english,String chinese){
        return grammar.get(english);
    }

    /*
    * 以下为get/set方法
    */
    public Map<String, String> getGrammar() {
        return grammar;
    }

    public void setGrammar(Map<String, String> grammar) {
        this.grammar = grammar;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
