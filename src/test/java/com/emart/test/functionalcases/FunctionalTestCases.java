package com.emart.test.functionalcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.annotation.DirtiesContext.MethodMode;

import com.emart.entitys.Category;
import com.emart.entitys.SubCategory;
import com.emart.entitys.User;
import com.emart.repos.CategoryRepository;
import com.emart.repos.SubCategoryRepository;
import com.emart.repos.UserRepository;
import com.emart.services.UserService;
import com.emart.servicesImpl.CategoryServiceImpl;
import com.emart.servicesImpl.SubCategoryServiceImpl;
import com.emart.servicesImpl.UserServiceImpl;
import com.emart.test.utilityclasses.CategoryData;
import com.emart.test.utilityclasses.SubCategoryData;
import com.emart.test.utilityclasses.UserData;



/**
 * @author B Shashidhar
 * 
 * @date 08 May 2020
 */
@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = ClassMode.AFTER_CLASS, methodMode = MethodMode.BEFORE_METHOD)
public class FunctionalTestCases {
	@Mock
	private UserService userService;
	@Mock
	private UserRepository userRepository;
	@Mock
	private CategoryRepository categoryRepository;
	@Mock
	private SubCategoryRepository subCategoryRepository;
	@Mock
	private User user;
	@Mock
	private Category category;
	@Mock
	private SubCategory subCategory;
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	@InjectMocks
	private CategoryServiceImpl categoryServiceImpl;
	@InjectMocks
	private SubCategoryServiceImpl subCategoryServiceImpl;	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}	
	@Test
	public void testCreateUser() {
		Long id=UserData.getUserDetails().getId();
		assertNotNull(id);
	}
	@Test
	public void testGetUsername() {
		userServiceImpl.getByUsername("Shashidhar");
		verify(userRepository, times(1)).findByUsername("Shashidhar");
	}
	@Test
	public void testStatusOfUsername() {
		Boolean status = UserData.getUserDetails().getUserBlocked();
		assertEquals(status, false);
	}
	@Test
	public void testCreateCategory() {
		String id=CategoryData.getCategoryDetails().getCategory_ID();
		assertNotNull(id);
	}
	@Test
	public void testSubCreateCategory() {
		String id=SubCategoryData.getSubCategoryDetails().getSubcategory_ID();
		assertNotNull(id);
	}
	@Test
	public void getAllCategoryTest() {		
		List<Category> categoryList = new ArrayList<>();
		categoryList.add(new Category());
		categoryList.add(new Category());
		when(categoryRepository.findAll()).thenReturn((List<Category>) categoryList);
		assertEquals(2, categoryList.size());		
	}	
	@Test
	public void getAllSubCategoryTest() {
		List<SubCategory> list = new ArrayList<SubCategory>();
		SubCategory subCategory1 = new SubCategory();
		subCategory1.setSubcategory_ID("1");
		subCategory1.setSubcategory_Name("subcat-name");
		subCategory1.setCategory_ID("1");
		subCategory1.setBrief_Details("Details");
		subCategory1.setGSTPer(10L);
		SubCategory subCategory2 = new SubCategory();
		subCategory2.setSubcategory_ID("2");
		subCategory2.setSubcategory_Name("subcat-name");
		subCategory2.setCategory_ID("2");
		subCategory2.setBrief_Details("Details");
		subCategory2.setGSTPer(10L);
		list.add(subCategory1);
		list.add(subCategory2);
		when(subCategoryRepository.findAll()).thenReturn(list);	
		assertEquals(2,list.size());
	}
}
