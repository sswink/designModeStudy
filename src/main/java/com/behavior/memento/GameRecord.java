package com.behavior.memento;


/**
 * @description: 
 * @author: ziHeng
 * @create: 2018-08-14 19:39
 **/
public class GameRecord {

    //战斗力
    private int fightingNum;
    
    //状态
    private String status;

    //存档日期(不可修改)
    private String time;

    public GameRecord(int fightingNum, String status, String time) {
        this.fightingNum = fightingNum;
        this.status = status;
        this.time = time;
    }

    //插入存档列表
    public void createMemento(){
        Memento memento = new Memento(fightingNum, status, time);
        Caretaker.getMementoMap().put(time,memento);
    }

    //存档回滚操作 roll-back
    public void mementoRollBack(Memento memento){
        fightingNum = memento.getFightingCapacity();
        status = memento.getStatus();
    }

    public int getFightingNum() {
        return fightingNum;
    }

    public void setFightingNum(int fightingNum) {
        this.fightingNum = fightingNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GameRecord{" +
                "fightingNum=" + fightingNum +
                ", status='" + status + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
