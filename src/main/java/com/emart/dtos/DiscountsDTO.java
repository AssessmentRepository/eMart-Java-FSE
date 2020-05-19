package com.emart.dtos;

import java.time.LocalDate;

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
public class DiscountsDTO {
	@Id
	private String ID;
	private String discount_Code;
	private Long percentage;
	private LocalDate start_Date;
	private LocalDate end_Date;
	private String description;
}
