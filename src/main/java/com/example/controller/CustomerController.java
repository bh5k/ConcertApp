package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public List<Customer> getCustomer(@PathVariable int id) {

        List<Customer> customers = customerService.findById(id);

        return customers;
    }

    @GetMapping()
    public List<Customer> getCustomers() {

        List<Customer> customers = customerService.findAll();

        return customers;
    }
}
