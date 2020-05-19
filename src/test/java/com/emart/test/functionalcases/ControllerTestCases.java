package com.emart.test.functionalcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.emart.entitys.Category;
import com.emart.entitys.SubCategory;
import com.emart.entitys.User;
import com.emart.test.utilityclasses.CategoryData;
import com.emart.test.utilityclasses.SubCategoryData;
import com.emart.test.utilityclasses.UserData;

/**
 * @author B Shashidhar
 * 
 * @date 08 May 2020
 */

public class ControllerTestCases extends AbstractTest {
	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void createUser() throws Exception {
		String uri = "/eMart/user/signUp";
		User user = UserData.getUserDetails();
		String inputJson = super.mapToJson(user);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "User is created successfully");
	}

	@Test
	public void getCategories() throws Exception {
		String uri = "/categories";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		Categories[] categories = super.mapFromJson(content, Categories[].class);
		assertTrue(categories.length > 0);
	}

	@Test
	public void createCategory() throws Exception {
		String uri = "/eMart/ecommerce/admin/addCategory";
		Category category = CategoryData.getCategoryDetails();
		String inputJson = super.mapToJson(category);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "Category is created successfully");
	}

	@Test
	public void getSubCategories() throws Exception {
		String uri = "/subCategories";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		SubCategory[] subCategories = super.mapFromJson(content, SubCategory[].class);
		assertTrue(subCategories.length > 0);
	}

	@Test
	public void createSubCategory() throws Exception {
		String uri = "/eMart/ecommerce/admin/addSubCategory";
		SubCategory subCategory = SubCategoryData.getSubCategoryDetails();
		String inputJson = super.mapToJson(subCategory);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "SubCategory is created successfully");
	}

	@Test
	public void deleteCategory() throws Exception {
		String uri = "/eMart/ecommerce/admin/deleteCategory/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "Category is deleted successsfully");
	}
	@Test
	public void deleteSubCategory() throws Exception {
		String uri = "/eMart/ecommerce/admin/deleteSubCategory/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "SubCategory is deleted successsfully");
	}
}
