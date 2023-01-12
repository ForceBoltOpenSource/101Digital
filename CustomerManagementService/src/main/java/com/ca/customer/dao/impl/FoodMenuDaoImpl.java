package com.ca.customer.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ca.customer.dao.FoodMenuDao;
import com.ca.customer.domain.CreditCard;

@Repository
public class FoodMenuDaoImpl extends GenericDaoImpl<CreditCard> implements FoodMenuDao {
	public FoodMenuDaoImpl() {
		super.setDaoType(CreditCard.class);
	}

	@SuppressWarnings("unchecked")
	
	@Override
	public List<CreditCard> findAllMenuByResturantID(Long resturantId) {

		Query query = entityManager
				.createQuery("select food from FoodMenu  food  " + "where food.resturantId =:resturantId");
		return (List<CreditCard>) query.setParameter("resturantId", resturantId).getResultList();

	}
	@Override
    public CreditCard findByCardHolder(long customerId) {
        return entityManager.createQuery("SELECT c from CreditCard c where c.cardHolder.id = " + customerId, CreditCard.class).getSingleResult();
    }

}
