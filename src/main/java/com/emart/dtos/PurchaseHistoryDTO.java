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
public class PurchaseHistoryDTO {
	@Id
	private String ID;
	private String buyer_ID;
	private String seller_ID;
	private String transaction_ID;
	private String item_ID;
	private Integer number_Of_Items;
	private Date date_Time;
	private String remarks;
}
