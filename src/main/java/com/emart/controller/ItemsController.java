package com.emart.controller;

import java.util.List;

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

import com.emart.dtos.ItemsDTO;
import com.emart.dtos.Role;
import com.emart.services.ItemsService;
import com.emart.utility.TokenDetails;

/**
 * @author B Shashidhar
 *
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/ecommerce/items")
public class ItemsController {

	@Autowired
	private ItemsService itemService;
	
	@Autowired
	private TokenDetails tokenDetails;

	@PostMapping(value = "/addItems")
	public ResponseEntity<String> addItem(@RequestHeader("Authorization") String token,
			@RequestBody ItemsDTO itemsDTO) {
		tokenDetails.validateUser(token, Role.Seller.toString());
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@GetMapping(value = "/viewInventory")
	public ResponseEntity<List<ItemsDTO>> viewInventory(@RequestHeader("Authorization") String token) {
		tokenDetails.validateUser(token, Role.Seller.toString());
		return new ResponseEntity<>(itemService.getListOfItemSold(tokenDetails.getUserName(token)), HttpStatus.OK);
	}

	@GetMapping(value = "/searchItems")
	public ResponseEntity<List<ItemsDTO>> searchItems(@RequestHeader("Authorization") String token,
			@RequestParam String searchItem) {
		return new ResponseEntity<>(itemService.searchItem(searchItem), HttpStatus.OK);
	}

	@GetMapping(value = "/filterItems")
	public ResponseEntity<List<ItemsDTO>> filterItems(@RequestHeader("Authorization") String token,
			@RequestParam Long price, @RequestParam String manufacturer) {
		return new ResponseEntity<>(itemService.filterItems(price, manufacturer), HttpStatus.OK);
	}

	@GetMapping(value = "/itemList")
	public ResponseEntity<List<ItemsDTO>> getListOfItems(@RequestHeader("Authorization") String token) {
		return new ResponseEntity<>(itemService.getListOfItems(), HttpStatus.OK);
	}

	@GetMapping(value = "/itemDetails")
	public ResponseEntity<ItemsDTO> getItemDetails(@RequestHeader("Authorization") String token,
			@RequestParam String itemId) {
		return new ResponseEntity<>(itemService.getItemDetails(itemId), HttpStatus.OK);
	}

	@DeleteMapping(value = "deleteItem")
	public ResponseEntity<ItemsDTO> deleteItem(@RequestHeader("Authorization") String token,
			@RequestParam String itemId) {
		return new ResponseEntity<>(itemService.deleteItem(itemId), HttpStatus.OK);
	}

}
