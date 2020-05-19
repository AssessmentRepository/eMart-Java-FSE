package com.emart.services;

import java.util.List;

import com.emart.entitys.Category;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface CategoryService {
	/**
	 * 
	 * @param category
	 */
	void addCategory(Category category);
	/**
	 * 
	 * @return
	 */
	List<Category> getAllCategories();
	/**
	 * 
	 * @param categoryId
	 */
	void deleteCategory(Long categoryId);


}
