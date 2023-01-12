package com.ca.customer.dao.impl;

import org.springframework.stereotype.Repository;

import com.ca.customer.dao.AddressDao;
import com.ca.customer.domain.Address;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {
	public AddressDaoImpl() {
		super.setDaoType(Address.class);
	}
}
