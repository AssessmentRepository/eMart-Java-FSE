package com.emart.servicesImpl;

import org.springframework.stereotype.Service;

import com.emart.services.TransactionsService;

/**
 * @author B Shashidhar
 *
 * 
 */
@Service
public class TransactionsServiceImpl implements TransactionsService {

	@Override
	public Long getTaxDeatils(Long itemId) {
		// TODO Auto-generated method stub
		Long taxValue = 15l;
		return taxValue;
	}

}
