package com.siva.janni.profileservice.controller;

import com.siva.janni.model.Vehicle;
import com.siva.janni.profileservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/vehicle")
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @GetMapping("/vehicles")
    public List<Vehicle> fetchVehicles() {
        return vehicleService.findVehicles();
    }
}
