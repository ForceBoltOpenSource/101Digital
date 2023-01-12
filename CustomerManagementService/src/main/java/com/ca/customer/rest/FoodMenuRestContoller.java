package com.ca.customer.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ca.customer.domain.CreditCard;
import com.ca.customer.service.FoodMenuService;

@RestController
@RequestMapping("/api")
public class FoodMenuRestContoller {

	private FoodMenuService foodMenuService;

	public FoodMenuRestContoller(FoodMenuService therestaurantService) {
		foodMenuService = therestaurantService;
	}

	@GetMapping("/customer/carddetails")
	public List<CreditCard> findall() {
		return foodMenuService.findAll();
	}

	@GetMapping("/customer/carddetails/{cardId}")
	public  CreditCard getCardDetails(@PathVariable int cardId) {
		return foodMenuService.findOne((long) cardId);
	}

	@RequestMapping(value = "/customer/carddetails", method = RequestMethod.POST)
	public CreditCard uploadCard(@RequestBody CreditCard foodMenu) {
	//	foodMenu.setId(null);
		foodMenuService.save(foodMenu);
		return foodMenu;
	}

}
