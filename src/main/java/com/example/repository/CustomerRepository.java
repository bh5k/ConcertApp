package com.example.repository;

import com.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class CustomerRepository {
    public List<Customer> findAll() {
        //this is where I would call my database
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setName("Bryan");
        customers.add(customer);
        customer = new Customer();
        customer.setName("Daniel");
        customers.add(customer);
        return customers;
    }

    public List<Customer> findById(int id) {

        //do some lookup in the database for one record by id.
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setName("Daniel");
        customers.add(customer);
        return customers;
    }

    //database stuff
    //inject a database connection
    //queries against the database
    //crud functions, create read update delete customers
}
