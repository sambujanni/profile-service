package com.siva.janni.profileservice.repo;

import com.siva.janni.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {
}
