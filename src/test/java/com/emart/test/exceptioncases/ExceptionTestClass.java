package com.emart.test.exceptioncases;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.emart.exceptionutility.BadRequestException;
import com.emart.exceptionutility.RecordNotFoundException;
import com.emart.servicesImpl.ItemsServiceImpl;
import com.emart.servicesImpl.UserServiceImpl;





@RunWith(JUnitPlatform.class)
public class ExceptionTestClass {
	 
    
	@Test(expected=NullPointerException.class)
	public void getByUsername() {
		UserServiceImpl myMockedList = mock(UserServiceImpl.class);  
		 when(myMockedList.getByUsername(null)).thenThrow(new NullPointerException());
		 myMockedList.getByUsername(null);
	}
	
	@Test(expected=BadRequestException.class)
	public void getUser() {
		UserServiceImpl myMockedList = mock(UserServiceImpl.class);  
		 when(myMockedList.getByUsername("user")).thenThrow(new BadRequestException("user already existed"));
		 myMockedList.getByUsername("user");
	}
	
	@Test(expected=RecordNotFoundException.class)
	public void getUserDetails() {
		UserServiceImpl myMockedList = mock(UserServiceImpl.class);  
		 when(myMockedList.getByUsername("user")).thenThrow(new
				 RecordNotFoundException("No record Found"));
		 myMockedList.getByUsername("user");
	}
	
	@Test(expected=Exception.class)
	public void getLoginUser() {
		UserServiceImpl myMockedList = mock(UserServiceImpl.class);  
		when(myMockedList.getByUsername("user")).thenThrow(new Exception("Internal Server Exception"));
		 myMockedList.getByUsername("user");
	}
	
	@Test(expected=NullPointerException.class)
	public void searchItemsByName() {
		ItemsServiceImpl myMockedList = mock(ItemsServiceImpl.class);  
		 when(myMockedList.searchItem(null)).thenThrow(new NullPointerException("value should present"));
		 myMockedList.searchItem(null);
	}
	
	@Test(expected=Exception.class)
	public void searchItems() {
		ItemsServiceImpl myMockedList = mock(ItemsServiceImpl.class);  
		 when(myMockedList.searchItem(null)).thenThrow(new NullPointerException("value should present"));
		 myMockedList.searchItem(null);
	}

}
