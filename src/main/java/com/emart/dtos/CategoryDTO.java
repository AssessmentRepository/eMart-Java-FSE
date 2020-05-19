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
public class CategoryDTO {
	@Id
	private String category_ID;
	private String category_Name;
	private String brief_Details;
}
