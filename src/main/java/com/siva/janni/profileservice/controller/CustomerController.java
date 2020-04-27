package com.siva.janni.profileservice.controller;

import com.siva.janni.model.Customer;
import com.siva.janni.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/profiles")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> fetchCustomers() {
        return customerService.findCustomers();
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> fetchCustomer(@PathVariable int id) {
        return customerService.findCustomerById(id);
    }

    public void deleteCustomers() {
        customerService.deleteCustomers();
    }
}
