package com.emart.entitys;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author B Shashidhar
 *
 * 
 */
@Data
@Document("Transactions")
public class Transactions {
	@Id
	private String ID;
	private String user_ID;
	private String seller_ID;
	private String transaction_Type;
	private LocalDate date_Time;
	private String remarks;
}
