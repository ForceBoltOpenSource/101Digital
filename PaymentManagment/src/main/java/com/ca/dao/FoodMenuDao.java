package com.ca.dao;

import java.util.List;

import com.ca.domain.CreditCard;

public interface FoodMenuDao extends GenericDao<CreditCard>{

	public List<CreditCard >findAllMenuByResturantID(Long resturantId);
	

}
