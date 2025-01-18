package com.demo.services;

import com.demo.dto.*;
import com.demo.dto.parkingSpot.*;
import com.demo.enums.*;
import com.demo.interfaces.*;

public class ParkingSpotServiceImpl implements ParkingSpotService {
    DisplayService displayService= new DisplayServiceImpl();

    @Override
    public ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor) {
        
        //ParkingSpot parkingSpot= (ParkingSpot) parkingSpotEnum.getParkingSpot().getConstructor(Integer.class).newInstance(floor);
        ParkingSpot parkingSpot = new ParkingSpot(floor, parkingSpotEnum);
        ParkingLot.getInstance().getFreeParkingSpots().get(parkingSpotEnum).add(parkingSpot);
        displayService.update(parkingSpotEnum,1);
        return parkingSpot;
        
    }
}
