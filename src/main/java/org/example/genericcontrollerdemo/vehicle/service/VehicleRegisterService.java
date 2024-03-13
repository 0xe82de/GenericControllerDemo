package org.example.genericcontrollerdemo.vehicle.service;

import lombok.extern.slf4j.Slf4j;
import org.example.genericcontrollerdemo.vehicle.domain.Vehicle;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class VehicleRegisterService {

    public void register(Vehicle vehicle) {
        log.info("vehicle={}", vehicle);
    }
}
