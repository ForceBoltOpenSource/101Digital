package com.ca.customer.dao;

import java.util.List;

import com.ca.customer.domain.CreditCard;

public interface FoodMenuDao extends GenericDao<CreditCard>{
	CreditCard findByCardHolder(long customerId);
	public List<CreditCard >findAllMenuByResturantID(Long resturantId);
	

}
