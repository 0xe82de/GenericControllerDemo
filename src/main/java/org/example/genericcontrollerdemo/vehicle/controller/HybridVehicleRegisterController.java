package org.example.genericcontrollerdemo.vehicle.controller;

import org.example.genericcontrollerdemo.vehicle.controller.dto.HybridVehicleRegisterInfo;
import org.example.genericcontrollerdemo.vehicle.service.VehicleRegisterService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@Profile("hybridVehicle")
@RestController
public class HybridVehicleRegisterController extends AbstractVehicleRegisterController<HybridVehicleRegisterInfo> {

    public HybridVehicleRegisterController(VehicleRegisterService vehicleRegisterService) {
        super(vehicleRegisterService);
    }

    @Override
    public void register(HybridVehicleRegisterInfo hybridVehicleRegisterInfo) {
        vehicleRegisterService.register(hybridVehicleRegisterInfo.toEntity());
    }
}
