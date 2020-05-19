package com.emart.test.utilityclasses;

import com.emart.entitys.SubCategory;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author B Shashidhar
 *
 * 
 */
public class SubCategoryData {
	public static SubCategory getSubCategoryDetails() {
		SubCategory subCategory = new SubCategory();		
		subCategory.setSubcategory_ID("1");
		subCategory.setSubcategory_Name("subcat-name");
		subCategory.setCategory_ID("1");
		subCategory.setBrief_Details("Details");
		subCategory.setGSTPer(10L);
		return subCategory;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
