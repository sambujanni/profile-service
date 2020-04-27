package com.siva.janni.profileservice.service;

import com.siva.janni.model.Vehicle;
import com.siva.janni.profileservice.repo.VehicleRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public Vehicle save(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    public List<Vehicle> findVehicles() {
        return vehicleRepo.findAll();
    }

    public Optional<Vehicle> findVehicleById(int id) {
        return vehicleRepo.findById(id);
    }
}
