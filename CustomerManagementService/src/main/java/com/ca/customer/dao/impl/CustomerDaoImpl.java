package com.ca.customer.dao.impl;

import org.springframework.stereotype.Repository;

import com.ca.customer.dao.CustomerDao;
import com.ca.customer.domain.Customer;

@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao{

	public CustomerDaoImpl() {
		super.setDaoType(Customer.class);
	}
	
}
