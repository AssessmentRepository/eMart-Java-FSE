package com.emart.servicesImpl;

import org.springframework.stereotype.Service;

import com.emart.dtos.DiscountsDTO;
import com.emart.services.DiscountsService;

/**
 * @author B Shashidhar
 *
 * 
 */
@Service
public class DiscountsServiceImpl implements DiscountsService {

	@Override
	public void saveDisscounts(DiscountsDTO discountsDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getDiscountAmount(Long itemId) {
		// TODO Auto-generated method stub
		Long taxValue = 15l;
		return taxValue;
	}

}
