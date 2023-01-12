package com.ca.dao.impl;

import org.springframework.stereotype.Repository;

import com.ca.dao.PaymentDao;
import com.ca.domain.Payment;
@Repository("PaymentDao")
public class PaymentDaoImpl  extends GenericDaoImpl<Payment> implements PaymentDao{
	public PaymentDaoImpl() {
		super.setDaoType(Payment.class);
	}
}
