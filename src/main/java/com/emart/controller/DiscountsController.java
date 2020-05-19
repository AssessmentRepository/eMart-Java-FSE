package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dtos.DiscountsDTO;
import com.emart.dtos.Role;
import com.emart.services.DiscountsService;
import com.emart.utility.TokenDetails;

/**
 * @author B Shashidhar
 *
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/ecommerce/discounts")
public class DiscountsController {
	
	@Autowired
	private TokenDetails tokenDetails;
	
	@Autowired
	private DiscountsService discountsService;

	@PostMapping(value = "/addorUpdateDiscount")
	public ResponseEntity<String> addorUpdateDiscount(@RequestHeader("Authorization") String token,
			@RequestBody DiscountsDTO discountsDTO) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		discountsService.saveDisscounts(discountsDTO);
		return new ResponseEntity<>("successfully added", HttpStatus.OK);
	}
	
	@PostMapping(value = "/getDiscountByItem")
	public ResponseEntity<Long> getDiscountByItem(@RequestHeader("Authorization") String token,
			@RequestParam Long itemId) {
		tokenDetails.validateUser(token, Role.Buyer.toString());
		return new ResponseEntity<>(discountsService.getDiscountAmount(itemId), HttpStatus.OK);
	}
	
}
