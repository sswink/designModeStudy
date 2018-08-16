package com.creation.builder;

/**
 * @description: 建造者模式
 * @author: ziHeng
 * @create: 2018-08-05 16:50
 **/
public class BuilderTest {

    public static void main(String[] args) {

        HouseBuilder houseBuilder = new VillaBuilder();
        HouseDirector.makeHouse(houseBuilder);


        System.out.println("-------");
        System.out.println("获取房屋实例");
        House house = houseBuilder.getHouse();
        System.out.println(house.getClass().getComponentType());
        System.out.println(house.getDoor());
        System.out.println(house.getFloor());
        System.out.println(house.getResult());
    }

}
