package org.example.genericcontrollerdemo.vehicle.domain;

import lombok.ToString;

@ToString(callSuper = true)
public class HybridVehicle extends Vehicle {

    private final int batteryCapacity;

    public HybridVehicle(String name, int fuelCapacity, int batteryCapacity) {
        super(name, fuelCapacity);
        this.batteryCapacity = batteryCapacity;
    }
}
