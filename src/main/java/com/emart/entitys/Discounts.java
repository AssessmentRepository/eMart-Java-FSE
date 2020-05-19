package com.emart.entitys;

import java.util.Date;

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

@Document("Discounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discounts {
	@Id
	private String ID;
	private String discount_Code;
	private Long percentage;
	private Date start_Date;
	private Date end_Date;
	private String description;
}
