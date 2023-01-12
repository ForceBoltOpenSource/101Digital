package com.ca.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ca.domain.FoodMenu;
import com.ca.service.FoodMenuService;

@RestController
@RequestMapping("/api")
public class FoodMenuRestContoller {

	private FoodMenuService foodMenuService;

	public FoodMenuRestContoller(FoodMenuService therestaurantService) {
		foodMenuService = therestaurantService;
	}

	@GetMapping("/restaurants/foodmenu")
	public List<FoodMenu> findall() {
		return foodMenuService.findAll();
	}

	@GetMapping("/restaurants/foodmenu/{foodmenuId}")
	public  FoodMenu getMenu(@PathVariable int foodmenuId) {
		return foodMenuService.findOne((long) foodmenuId);
	}

	@RequestMapping(value = "/restaurants/foodmenu", method = RequestMethod.POST)
	public FoodMenu upload(@RequestBody FoodMenu foodMenu) {
		foodMenu.setId(null);
		foodMenuService.save(foodMenu);
		return foodMenu;
	}

}
