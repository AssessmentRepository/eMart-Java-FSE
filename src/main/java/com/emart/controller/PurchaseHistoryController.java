package com.emart.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dtos.PurchaseHistoryDTO;
import com.emart.dtos.Role;
import com.emart.services.PurchaseHistoryService;
import com.emart.utility.TokenDetails;

/**
 * @author B Shashidhar
 *
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/ecommerce/purchasehistory")
public class PurchaseHistoryController {

	@Autowired
	private TokenDetails tokenDetails;
	
	@Autowired
	private PurchaseHistoryService purchaseHistoryService;
	
	@GetMapping(value = "/purchasesHistory")
	public ResponseEntity<List<PurchaseHistoryDTO>> purchasesHistory(@RequestHeader("Authorization") String token) {
		tokenDetails.validateUser(token, Role.Buyer.toString());
		return new ResponseEntity<>(purchaseHistoryService.purchasesHistory(tokenDetails.getUserName(token)), HttpStatus.OK);
	}
	
	@GetMapping(value = "/generateReport")
	public ResponseEntity<List<PurchaseHistoryDTO>> generateReport(@RequestHeader("Authorization") String token,@RequestParam LocalDate startDate,@RequestParam LocalDate endDate) {
		tokenDetails.validateUser(token, Role.Seller.toString());
		return new ResponseEntity<>(purchaseHistoryService.generateReport(startDate,endDate), HttpStatus.OK);
	}
}
