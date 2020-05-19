package com.emart.dtos;

import java.util.Date;

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
public class TransactionsDTO {
	@Id
	private String ID;
	private String user_ID;
	private String seller_ID;
	private String transaction_Type;
	private Date date_Time;
	private String remarks;
}
