package com.construction.adapter.delegateAdapter;

import com.construction.adapter.AdapterInterface;
import com.construction.adapter.Voltage220;

/**
 * @description: 电压适配器
 * @author: ziHeng
 * @create: 2018-08-10 16:57
 **/
public class DelegateAdapter implements AdapterInterface{

    private Voltage220 voltage220;

    public DelegateAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public void adapterOutput() {
        //220v
        voltage220.output();
        System.out.println("----经过适配器后----");
        System.out.println("输出110V");
    }

}
