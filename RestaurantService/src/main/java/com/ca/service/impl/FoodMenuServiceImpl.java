package com.ca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ca.dao.FoodMenuDao;
import com.ca.domain.FoodMenu;
import com.ca.service.FoodMenuService;

@Service
@Transactional
public class FoodMenuServiceImpl implements FoodMenuService {
	@Autowired
	private FoodMenuDao foodMenuDao;

	public void save(FoodMenu foodMenu) {
		foodMenuDao.save(foodMenu);
	}

	public FoodMenu update(FoodMenu foodMenu) {
		return foodMenuDao.update(foodMenu);
	}

	public List<FoodMenu> findAll() {
		return (List<FoodMenu>) foodMenuDao.findAll();
	}

	public FoodMenu findOne(Long id) {
		return foodMenuDao.findOne(id);
	}

	public List<FoodMenu> findAllMenuByResturantID(Long resturantId) {
		return foodMenuDao.findAllMenuByResturantID(resturantId);
	}

}
