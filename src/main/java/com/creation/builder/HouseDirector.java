package com.creation.builder;

/**
 * @description: 指挥者
 * @author: ziHeng
 * @create: 2018-08-05 17:15
 **/
public class HouseDirector {

    public static void makeHouse(HouseBuilder houseBuilder){
        System.out.println("选择材料");
        houseBuilder.doorMaterial();
        houseBuilder.floorMaterial();
        System.out.println("材料选择完毕……");
        if(houseBuilder.getClass().getSimpleName().equalsIgnoreCase("VillaBuilder")){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            houseBuilder.getHouse().setResult("资金不足，建房项目取消");
            System.out.println("资金不足，无法创建别墅");
        }else {
            houseBuilder.getHouse().setResult("建房成功");
        }

    }

}
