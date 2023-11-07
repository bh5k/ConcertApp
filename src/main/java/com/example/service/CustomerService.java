package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerService {

    private final CustomerRepository customerRepositoy;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepositoy = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepositoy.findAll();
    }

    public List<Customer> findById(int id) {
        return customerRepositoy.findById(id);
    }
}
