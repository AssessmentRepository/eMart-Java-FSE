package com.emart.test.utilityclasses;

import com.emart.entitys.Items;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author B Shashidhar
 *
 * 
 */
public class ItemsData {
	public static Items getItemsDetails() {
		Items items = new Items();
		items.setID("1");
		items.setCategory_ID("1");
		items.setSubcategory_ID("1");
		items.setPrice(20L);
		items.setItem_Name("icream");
		items.setDescription("food item");
		items.setStock_Number(23);
		items.setRemarks("Non");
		return items;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
