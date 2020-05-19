package com.emart.services;

import com.emart.dtos.DiscountsDTO;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface DiscountsService {
	/**
	 * 
	 * @param discountsDTO
	 */
	void saveDisscounts(DiscountsDTO discountsDTO);
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	Long getDiscountAmount(Long itemId);
}
