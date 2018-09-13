package com.nursh.dao;

import com.nursh.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();
    public Customer getCustomer(int id);
    public void saveCustomer(Customer customer);
}
