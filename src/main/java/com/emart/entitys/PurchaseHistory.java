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
@Data
@Document("PurchaseHistory")
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistory {
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
