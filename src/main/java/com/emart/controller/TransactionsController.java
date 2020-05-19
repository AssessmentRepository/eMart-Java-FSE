package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dtos.Role;
import com.emart.services.TransactionsService;
import com.emart.utility.TokenDetails;

/**
 * @author B Shashidhar
 *
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/ecommerce/transactions")
public class TransactionsController {

	@Autowired
	private TokenDetails tokenDetails;
	
	@Autowired
	private TransactionsService transactionsService;
	
	@GetMapping(value = "/taxDetails")
	public ResponseEntity<Long> getTaxDetails(@RequestHeader("Authorization") String token,
			 @RequestParam Long itemId) {
		tokenDetails.validateUser(token, Role.Buyer.toString());
		return new ResponseEntity<>(transactionsService.getTaxDeatils(itemId), HttpStatus.OK);
	}

}
