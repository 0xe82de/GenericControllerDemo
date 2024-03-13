package org.example.genericcontrollerdemo.vehicle.domain;

import lombok.ToString;

@ToString
public class Vehicle {

    private final String name;

    private final int fuelCapacity;

    public Vehicle(String name, int fuelCapacity) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
    }
}
