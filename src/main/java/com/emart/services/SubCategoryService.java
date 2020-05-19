package com.emart.services;

import java.util.List;

import com.emart.entitys.SubCategory;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface SubCategoryService {

	List<SubCategory> getAllSubCategories();

	/**
	 * @param subCategory
	 */
	void addSubCategory(SubCategory subCategory);
	/**
	 * 
	 * @param subCategory
	 */
	void deleteSubCategory(Long subCategory);
}
