package com.emart.test.utilityclasses;

import com.emart.entitys.Discounts;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author B Shashidhar
 *
 * 
 */
public class DiscountsData {
	public static Discounts getDiscountsDetails() {
		Discounts discounts = new Discounts();
		discounts.setID("1");
		discounts.setDiscount_Code("firstuser");
		discounts.setPercentage(1L);
		discounts.setDescription("First User Coupan");		
		return discounts;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
