package com.ca.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ca.domain.FoodMenu;
import com.ca.domain.Restaurant;
import com.ca.service.RestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantRestContoller {

	private RestaurantService restaurantService;
	
	@Autowired
	public RestaurantRestContoller(RestaurantService therestaurantService) {
		restaurantService = therestaurantService;
	}

	@GetMapping("/restaurants")
	public List<Restaurant> findall() {
		return restaurantService.findAll();
	}

	@GetMapping("/restaurants/{restaurantId}")
	public Restaurant getResturant(@PathVariable int restaurantId) {
		return restaurantService.findOne((long) restaurantId);
	}

	@RequestMapping(value = "/restaurant/{restaurantId}/menu")
    public List<FoodMenu> showMenuByRestaurantId(@PathVariable int restaurantId) {
        return restaurantService.showFoodMenu((long)restaurantId);
    }

	@RequestMapping(value = "/register/restaurant", method = RequestMethod.POST)
	public Restaurant upload(@RequestBody Restaurant restaurant) {
		restaurant.setId(null);
		restaurantService.save(restaurant);
		return restaurant;
	}

}
