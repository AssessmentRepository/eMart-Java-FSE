package com.emart.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dtos.ItemsDTO;
import com.emart.services.ItemsService;
import com.emart.utility.MasterData;

/**
 * @author B Shashidhar
 *
 * 
 */
@Service
public class ItemsServiceImpl implements ItemsService {

	@Override
	public void addItem(ItemsDTO itemDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ItemsDTO> searchItem(String itemName) {
		return MasterData.getItemList();
	}

	@Override
	public void deleteItem(Long itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ItemsDTO> filterItems(Long price, String manufacturer) {
		// TODO Auto-generated method stub
		return  MasterData.getItemList();
	}

	@Override
	public List<ItemsDTO> getListOfItems() {
		// TODO Auto-generated method stub
		return  MasterData.getItemList();
	}

	@Override
	public ItemsDTO getItemDetails(String itemId) {
		// TODO Auto-generated method stub
		return  MasterData.getItem();
	}

	@Override
	public ItemsDTO deleteItem(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemsDTO> getListOfItemSold(String sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
