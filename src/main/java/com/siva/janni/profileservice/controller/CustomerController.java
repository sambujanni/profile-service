package com.siva.janni.profileservice.controller;

import com.siva.janni.model.Customer;
import com.siva.janni.profileservice.service.CustomerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

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
    public ResponseEntity fetchCustomers() {
        Map<String, Object> data = new ConcurrentHashMap<>();
        data.put("status", "success");
        data.put("body", customerService.findCustomers());
        return new ResponseEntity(data, HttpStatus.OK);
    }

    @GetMapping("/customer")
    public ResponseEntity fetchCustomer(@RequestParam int id) throws NotFoundException {
        ResponseObject object = new ResponseObject(true,
                customerService.findCustomerById(id));
        return new ResponseEntity(object, HttpStatus.OK);
    }

    public void deleteCustomers() {
        customerService.deleteCustomers();
    }
}
