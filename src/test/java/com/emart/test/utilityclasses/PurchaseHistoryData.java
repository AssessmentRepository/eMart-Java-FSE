package com.emart.test.utilityclasses;

import com.emart.entitys.PurchaseHistory;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author B Shashidhar
 *
 * 
 */
public class PurchaseHistoryData {
	public static PurchaseHistory getPurchaseHistoryDetails() {
		PurchaseHistory purchaseHistory = new PurchaseHistory();		
		purchaseHistory.setID("1");
		purchaseHistory.setBuyer_ID("1");
		purchaseHistory.setSeller_ID("1");
		purchaseHistory.setTransaction_ID("tra-1");
		purchaseHistory.setNumber_Of_Items(2);
		purchaseHistory.setRemarks("Non");		
		return purchaseHistory;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
