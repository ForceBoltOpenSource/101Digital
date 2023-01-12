package com.ca.dao.impl;
 
import org.springframework.stereotype.Repository;

import com.ca.dao.CreditCardDao;
import com.ca.domain.CreditCard;

@Repository("creditCardDao")
public class CreditCardDaoImpl  extends GenericDaoImpl<CreditCard> implements CreditCardDao {
	public CreditCardDaoImpl() {
		super.setDaoType(CreditCard.class);
	}
}
