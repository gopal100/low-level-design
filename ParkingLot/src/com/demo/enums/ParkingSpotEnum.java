package com.demo.enums;

public enum ParkingSpotEnum {

    COMPACT(20),
    MINI(10),
    LARGE(30);

    private int cost;

    ParkingSpotEnum(int cost){
        this.cost= cost;
    }

    public int getCost(){
        return cost;
    }

}
