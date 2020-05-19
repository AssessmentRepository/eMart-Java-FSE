package com.emart.services;

import java.time.LocalDate;
import java.util.List;

import com.emart.dtos.PurchaseHistoryDTO;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface PurchaseHistoryService {
	
    /**
     * 
     * @param userName
     * @return
     */
	List<PurchaseHistoryDTO> purchasesHistory(String userName);
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<PurchaseHistoryDTO> generateReport(LocalDate startDate,LocalDate endDate);
	
}
