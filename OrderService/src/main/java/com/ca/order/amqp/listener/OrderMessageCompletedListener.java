package com.ca.order.amqp.listener;

import java.util.Locale;

import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ca.order.domain.Customer;
import com.ca.order.domain.Order;
import com.ca.order.domain.Order.OrderStatus;
import com.ca.order.service.EmailService;

@Component
public class OrderMessageCompletedListener {
	@Autowired
	private EmailService emailService;
	@Autowired
	private RestTemplate restTemplate;
	
	private String paymentManagmentUrl = "http://Customer-service/customers/";


	public void listenOrderCompleteMessage(Order order) throws MessagingException {

		System.out.println("inside the listenier ............." + order.getRestaurantName() + order.getTotalPrice()
				+ order.getUserName());
		if (order.getOrderStatus() == OrderStatus.Finished) {
			Customer customer = restTemplate.getForObject(paymentManagmentUrl+order.getUserName(),Customer.class);
			
			emailService.sendOrderReceivedMail(customer.getFirstName(), customer.getEmail(), order, new Locale("en"));
			System.out.println("The Email is on the WAY!!!");
		}

	}

}
