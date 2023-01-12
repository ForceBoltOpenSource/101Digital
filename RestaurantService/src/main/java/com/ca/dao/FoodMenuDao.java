package com.ca.dao;

import java.util.List;

import com.ca.domain.FoodMenu;

public interface FoodMenuDao extends GenericDao<FoodMenu>{

	public List<FoodMenu >findAllMenuByResturantID(Long resturantId);
	

}
