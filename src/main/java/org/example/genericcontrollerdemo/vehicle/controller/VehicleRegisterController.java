package org.example.genericcontrollerdemo.vehicle.controller;

import org.example.genericcontrollerdemo.vehicle.controller.dto.VehicleRegisterInfo;
import org.example.genericcontrollerdemo.vehicle.service.VehicleRegisterService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@Profile("vehicle")
@RestController
public class VehicleRegisterController extends AbstractVehicleRegisterController<VehicleRegisterInfo> {

    public VehicleRegisterController(VehicleRegisterService vehicleRegisterService) {
        super(vehicleRegisterService);
    }

    @Override
    public void register(VehicleRegisterInfo vehicleRegisterInfo) {
        vehicleRegisterService.register(vehicleRegisterInfo.toEntity());
    }
}
