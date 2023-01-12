package com.ca.dao;



import java.util.List;

import com.ca.domain.FoodMenu;
import com.ca.domain.Restaurant;

public interface RestaurantDao extends GenericDao<Restaurant> {
	
	public List<FoodMenu>showFoodMenu(Long restaurantId);
}
