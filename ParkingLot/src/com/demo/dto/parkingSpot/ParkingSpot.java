package com.demo.dto.parkingSpot;

import java.util.concurrent.atomic.*;

import com.demo.enums.ParkingSpotEnum;

public class ParkingSpot {
    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private boolean isFree;
    private int floor;
    protected ParkingSpotEnum parkingSpotEnum;

    public ParkingSpot(){
        System.out.println("ParkingSpot");
    }

    public ParkingSpot(int floor, ParkingSpotEnum parkingSpotEnum){ 
        this.floor = floor;
        //this.amount = amount;
        this.parkingSpotEnum= parkingSpotEnum;
        isFree= true;
        id= x.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ParkingSpotEnum getAmount() {
        return parkingSpotEnum;
    }

    //public void setAmount(int amount) {
    //    this.amount = amount;
    //}
    public int cost(int parkingHours){
        return parkingHours* parkingSpotEnum.getCost();
    }
}
