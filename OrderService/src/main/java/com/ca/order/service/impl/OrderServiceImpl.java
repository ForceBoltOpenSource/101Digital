package com.ca.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ca.order.dao.OrderDao;
import com.ca.order.domain.Order;
import com.ca.order.service.OrderService;
@Service
@Transactional 
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;

    public void save( Order order) {  		
    	orderDao.save(order);
	}
    
    public Order update(Order order) {  		
		return orderDao.update(order);
	}
	
  	
	public List<Order> findAll() {
		return (List<Order>)orderDao.findAll();
	}

	
	public Order findOne(Long id) {
		return orderDao.findOne(id);
	}
	public List<Order>findOneByUserId(Long id) {
		
		return orderDao.findOneByUserId(id);
	}
	
	public List<Order> findAllSubSelect(){
		
		return orderDao.findAllSubSelect();
	}
	
	

}
