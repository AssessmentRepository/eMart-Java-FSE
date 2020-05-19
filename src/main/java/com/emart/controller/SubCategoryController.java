package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.services.SubCategoryService;

/**
 * @author B Shashidhar
 *
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/ecommerce/subcategory")
public class SubCategoryController {

	@Autowired
	private SubCategoryService categoryService;

	@GetMapping(value = "/categories")
	public ResponseEntity<?> getCategories() {
		return new ResponseEntity<>(categoryService.getAllSubCategories(), HttpStatus.OK);
	}
}
