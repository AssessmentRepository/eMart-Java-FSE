package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dtos.Role;
import com.emart.entitys.Category;
import com.emart.entitys.SubCategory;
import com.emart.services.CategoryService;
import com.emart.services.SubCategoryService;
import com.emart.services.UserService;
import com.emart.utility.TokenDetails;

@RestController
@CrossOrigin
@RequestMapping("/ecommerce/admin")
public class AdminController {

	@Autowired
	private UserService userService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private SubCategoryService subCategoryService;

	@Autowired
	private TokenDetails tokenDetails;

	@GetMapping(value = "/actions")
	public ResponseEntity<String> blockOrUnblock(@RequestHeader("Authorization") String token,
			@RequestParam String user, @RequestParam Boolean status) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		userService.blockOrUnblockUser(user, status);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@PostMapping(value = "/addCategory")
	public ResponseEntity<String> addCategory(@RequestHeader("Authorization") String token,
			@RequestBody Category category) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		categoryService.addCategory(category);
		return new ResponseEntity<>("successfully added", HttpStatus.OK);
	}

	@PostMapping(value = "/addSubCategory")
	public ResponseEntity<String> addSubCategory(@RequestHeader("Authorization") String token,
			@RequestBody SubCategory subCategory) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		subCategoryService.addSubCategory(subCategory);
		return new ResponseEntity<>("successfully added", HttpStatus.OK);
	}

	@GetMapping(value = "/blockItems")
	public ResponseEntity<String> blockItems(@RequestHeader("Authorization") String token, @RequestParam Long sellerId,
			@RequestParam Long itemId) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		return new ResponseEntity<>("Item Blocked", HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteCategory")
	public ResponseEntity<String> deleteCategory(@RequestHeader("Authorization") String token,
			@RequestParam Long categoryId) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		categoryService.deleteCategory(categoryId);
		return new ResponseEntity<>("successfully deleted", HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteSubCategory")
	public ResponseEntity<String> deleteSubCategory(@RequestHeader("Authorization") String token,
			@RequestParam Long sunCategoryId) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		subCategoryService.deleteSubCategory(sunCategoryId);

		return new ResponseEntity<>("successfully deleted", HttpStatus.OK);
	}

}
