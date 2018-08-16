package com.behavior.mediator;


import java.util.*;

/**
 * @description: 租赁中介
 * @author: ziHeng
 * @create: 2018-08-11 15:53
 **/
public class RentMediator implements Mediator {

    //游客
    private Map<Integer,Visitors> visitors;

    //房东
    private Map<Integer,Landlord> landlord;

    public RentMediator() {
        this.visitors = new HashMap<>();
        this.landlord = new HashMap<>();
    }

    @Override
    public void registerInfo(People people) {
        int acceptPrice = people.getAcceptablePrice();
        if(people instanceof Visitors){
            visitors.put(acceptPrice,(Visitors) people);
        }else if(people instanceof Landlord){
            landlord.put(acceptPrice,(Landlord)people);
        }
    }

    @Override
    public String deal() {
        if(visitors.isEmpty()){
            return "中介处暂时没有游客资源";
        }
        if(landlord.isEmpty()){
            return "中介处暂时没有房东资源";
        }

        //entrySet遍历效率更高
        Iterator<Map.Entry<Integer, Landlord>> landlordEntrySet = landlord.entrySet().iterator();
        Iterator<Map.Entry<Integer, Visitors>> visitorsEntrySet = visitors.entrySet().iterator();
        while (landlordEntrySet.hasNext()){
            Map.Entry<Integer, Landlord> landlordEntry = landlordEntrySet.next();
            while(visitorsEntrySet.hasNext()){
                Map.Entry<Integer, Visitors> visitorsEntry = visitorsEntrySet.next();
                if(Objects.equals(landlordEntry.getKey(), visitorsEntry.getKey())){
                    return "匹配出合理的价格:"+landlordEntry.getKey()+" 游客"+visitorsEntry.getValue().getName()+"和"+landlordEntry.getValue().getName();
                }
            }

        }

        //keySet遍历
        //for(Integer housePrice:landlord.keySet()){
        //    for(Integer acceptablePrice:visitors.keySet()){
        //        if(Objects.equals(housePrice, acceptablePrice)){
        //            return "匹配出合理的价格:"+acceptablePrice+" 姓名"+visitors.get(acceptablePrice).getName()+"-"+landlord.get(acceptablePrice).getName();
        //        }
        //    }
        //}
        return "没有合适的匹配选项";

    }


}
