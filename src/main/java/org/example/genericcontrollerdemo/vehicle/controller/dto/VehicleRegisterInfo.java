package org.example.genericcontrollerdemo.vehicle.controller.dto;

import lombok.Getter;
import org.example.genericcontrollerdemo.vehicle.domain.Vehicle;

@Getter
public class VehicleRegisterInfo {

    private final String name;

    private final int fuelCapacity;

    public VehicleRegisterInfo(String name, int fuelCapacity) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
    }

    public Vehicle toEntity() {
        return new Vehicle(name, fuelCapacity);
    }
}
