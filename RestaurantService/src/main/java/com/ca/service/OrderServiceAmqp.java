package com.ca.service;



import com.ca.domain.Order;

public interface OrderServiceAmqp {
	
	public void publish(Order order);

}
