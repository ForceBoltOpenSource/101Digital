package com.ca.customer.service;

import java.util.List;

import com.ca.customer.domain.CreditCard;


public interface FoodMenuService {
    public CreditCard findByCardHolder(long customerId);
	public void save(CreditCard foodMenu);
	public CreditCard update(CreditCard foodMenu);
	public List<CreditCard> findAll();
	public CreditCard findOne(Long id);
	public List<CreditCard >findAllMenuByResturantID(Long resturantId);
}
