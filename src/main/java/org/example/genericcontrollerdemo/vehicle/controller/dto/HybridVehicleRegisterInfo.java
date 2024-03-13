package org.example.genericcontrollerdemo.vehicle.controller.dto;

import lombok.Getter;
import org.example.genericcontrollerdemo.vehicle.domain.HybridVehicle;
import org.example.genericcontrollerdemo.vehicle.domain.Vehicle;

@Getter
public class HybridVehicleRegisterInfo extends VehicleRegisterInfo {

    private final int batteryCapacity;

    public HybridVehicleRegisterInfo(String name, int fuelCapacity, int batteryCapacity) {
        super(name, fuelCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public Vehicle toEntity() {
        return new HybridVehicle(getName(), getFuelCapacity(), batteryCapacity);
    }
}
