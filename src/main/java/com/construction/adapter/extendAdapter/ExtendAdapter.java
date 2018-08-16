package com.construction.adapter.extendAdapter;

import com.construction.adapter.AdapterInterface;
import com.construction.adapter.Voltage220;

/**
 * @description: 电压适配器
 * @author: ziHeng
 * @create: 2018-08-10 16:57
 **/
public class ExtendAdapter extends Voltage220 implements AdapterInterface{

    @Override
    public void adapterOutput() {
        //220v
        super.output();
        System.out.println("----经过适配器后----");
        System.out.println("输出110V");
    }

}
