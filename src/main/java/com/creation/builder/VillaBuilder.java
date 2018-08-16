package com.creation.builder;

/**
 * @description: 别墅创建者
 * @author: ziHeng
 * @create: 2018-08-05 17:07
 **/
public class VillaBuilder implements HouseBuilder{

    private House house = new House();

    //选择门的材料
    @Override
    public void doorMaterial() {
        house.setDoor("大门选择了金刚石");
    }

    //选择屋顶的材料
    @Override
    public void floorMaterial() {
        house.setFloor("屋顶选择艾德曼金属");
    }

    //返回产品实例的方法
    @Override
    public House getHouse() {
        return house;
    }

}

