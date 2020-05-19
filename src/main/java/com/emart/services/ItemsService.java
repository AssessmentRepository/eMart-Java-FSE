package com.emart.services;

import java.util.List;

import com.emart.dtos.ItemsDTO;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface ItemsService {

	/**
	 * 
	 * @param itemDTO
	 */
	void addItem(ItemsDTO itemDTO);
	/**
	 * 
	 * @param itemName
	 * @return
	 */
	List<ItemsDTO> searchItem(String itemName);
	/**
	 * 
	 * @param itemId
	 */
	void deleteItem(Long itemId);
	
	/**
	 * 
	 * @param price
	 * @param manufacturer
	 */
	List<ItemsDTO> filterItems(Long price,String manufacturer);
	/**
	 * 
	 * @return
	 */
	List<ItemsDTO> getListOfItems();
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	ItemsDTO getItemDetails(String itemId);
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	ItemsDTO deleteItem(String itemId);
	
	/**
	 * 
	 * @param sellerId
	 * @return
	 */
	List<ItemsDTO> getListOfItemSold(String sellerId);

}
