package com.emart.test.utilityclasses;

import com.emart.entitys.Category;

/**
 * @author B Shashidhar
 *
 * 
 */
public class CategoryData {
	public static Category getCategoryDetails() {
		Category category = new Category();
		category.setCategory_ID("1");
		category.setCategory_Name("cat-name-1");
		category.setBrief_Details("cat-name-1-detailed");		
		return category;
	}

//	public static String asJsonString(final Object obj) {
//		try {
//			return new ObjectMapper().writeValueAsString(obj);
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
}
