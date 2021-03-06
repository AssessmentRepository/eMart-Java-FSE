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
@Document("Category")
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	@Id
	private String category_ID;
	private String category_Name;
	private String brief_Details;
}
