package com.emart.dtos;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author B Shashidhar
 *
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoryDTO {
	@Id
	private String subcategory_ID;
	private String subcategory_Name;
	private String category_ID;
	private String brief_Details;
	private Long gstPer;
}
