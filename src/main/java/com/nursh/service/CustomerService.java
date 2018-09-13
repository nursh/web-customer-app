package com.nursh.service;

import com.nursh.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
}
