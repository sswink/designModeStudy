package com.construction.adapter;

import com.construction.adapter.delegateAdapter.DelegateAdapter;
import com.construction.adapter.extendAdapter.ExtendAdapter;

/**
 * @description: 适配器测试
 * @author: ziHeng
 * @create: 2018-08-10 16:33
 **/
public class AdapterTest {

    public static void main(String[] args) {

        //1、继承方式
        AdapterInterface extendAdapter = new ExtendAdapter();
        extendAdapter.adapterOutput();

        System.out.println("-----");

        //2、委让方式
        AdapterInterface delegateAdapter = new DelegateAdapter(new Voltage220());
        delegateAdapter.adapterOutput();

    }

}
