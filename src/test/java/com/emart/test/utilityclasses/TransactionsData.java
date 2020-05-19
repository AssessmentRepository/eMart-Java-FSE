package com.emart.test.utilityclasses;

import com.emart.entitys.Transactions;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author B Shashidhar
 *
 * 
 */
public class TransactionsData {
	public static Transactions getTransactionsDetails() {
		Transactions transactions = new Transactions();
		transactions.setID("1");
		transactions.setUser_ID("1");
		transactions.setSeller_ID("1");
		transactions.setTransaction_Type("Debit");
		transactions.setRemarks("Non");
		return transactions;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
