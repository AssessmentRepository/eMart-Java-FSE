package com.emart.entitys;

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
@Document("SubCategory")
@NoArgsConstructor
@AllArgsConstructor
public class SubCategory {
	@Id
	private String subcategory_ID;
	private String subcategory_Name;
	private String category_ID;
	private String brief_Details;
	private Long GSTPer;
}
