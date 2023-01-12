package com.ca.order.dao;



import java.util.List;

import com.ca.order.domain.Order;

public interface OrderDao extends GenericDao<Order> {

	public List<Order> findOneByUserId(Long id);
	public List<Order> findAllSubSelect();
}
