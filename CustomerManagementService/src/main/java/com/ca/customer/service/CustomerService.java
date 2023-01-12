package com.ca.customer.service;

import java.util.List;

import com.ca.customer.domain.Customer;

public interface CustomerService {
	public void save(Customer customer);
	public Customer update(Customer customer);
	public List<Customer> findAll();
	public Customer findOne(Long id);

}
