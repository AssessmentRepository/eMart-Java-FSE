package com.emart.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emart.dtos.ItemsDTO;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class MasterData {
	
	public static List<ItemsDTO> getItemList(){
		List<ItemsDTO> itemList = new ArrayList<>();
		itemList.add(getItem());
		return itemList;
	}
	
	public static ItemsDTO getItem() {
		ItemsDTO item = new ItemsDTO();
		item.setItem_Name("mobile");
		item.setPrice(1000L);
		item.setProductImage("image");
		item.setSellerName(Arrays.asList("samsung","Nokia","MI"));
		return item;
	}

}
