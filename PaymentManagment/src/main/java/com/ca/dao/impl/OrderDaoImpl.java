package com.ca.dao.impl;

import org.springframework.stereotype.Repository;

import com.ca.dao.OrderDao;
import com.ca.domain.Order;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
	public OrderDaoImpl() {
		super.setDaoType(Order.class);
	}
}
