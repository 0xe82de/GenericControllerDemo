package org.example.genericcontrollerdemo.vehicle.controller;

import lombok.RequiredArgsConstructor;
import org.example.genericcontrollerdemo.vehicle.controller.dto.VehicleRegisterInfo;
import org.example.genericcontrollerdemo.vehicle.service.VehicleRegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/vehicles")
public abstract class AbstractVehicleRegisterController<T extends VehicleRegisterInfo> {

    protected final VehicleRegisterService vehicleRegisterService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public abstract void register(@RequestBody T t);
}
