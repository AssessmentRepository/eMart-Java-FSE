package com.emart.dtos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author B Shashidhar
 *
 * 
 */
@Data
@Document("Items")
@NoArgsConstructor
@AllArgsConstructor
public class ItemsDTO {
	@Id
	private String ID;
	private String category_ID;
	private String subcategory_ID;
	private Long price;
	private String item_Name;
	private String description;
	private Integer stock_Number;
	private String remarks;
	private List<String> sellerName;
	private String productImage;
	private Integer stockRemaining;
	private String sellerId;
}
