package com.ca.order.service;



import com.ca.order.domain.Order;

public interface OrderServiceAmqp {
	
	public void publish(Order order);
	
//	public void publishPayment(Order order);

}
