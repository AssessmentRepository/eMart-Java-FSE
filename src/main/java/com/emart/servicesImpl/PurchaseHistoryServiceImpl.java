package com.emart.servicesImpl;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dtos.PurchaseHistoryDTO;
import com.emart.services.PurchaseHistoryService;

/**
 * @author B Shashidhar
 *
 * 
 */
@Service
public class PurchaseHistoryServiceImpl implements PurchaseHistoryService {

	@Override
	public List<PurchaseHistoryDTO> purchasesHistory(String userName) {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<PurchaseHistoryDTO> generateReport(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

}
