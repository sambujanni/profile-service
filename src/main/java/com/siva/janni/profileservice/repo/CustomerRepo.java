package com.siva.janni.profileservice.repo;

import com.siva.janni.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
