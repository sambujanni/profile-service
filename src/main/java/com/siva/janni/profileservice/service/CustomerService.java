package com.siva.janni.profileservice.service;

import com.siva.janni.model.Customer;
import com.siva.janni.profileservice.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    public List<Customer> findCustomers() {
        return customerRepo.findAll();
    }

    public Optional<Customer> findCustomerById(int id) {
        return customerRepo.findById(id);
    }

    public void deleteCustomers() {
        customerRepo.deleteAll();
    }
}
