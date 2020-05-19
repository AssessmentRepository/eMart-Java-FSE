package com.emart.dtos;

import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id = Instant.now().toEpochMilli();

	private String username;

	private String password;

	private List<UserRole> roles;

	private String companyname;

	private String gstin;
	
	private String aboutCompany;
	
	private String address;
	
	private String website;
	
	private String emailId;
	
	private String contactNumber;
	
	private Boolean userBlocked;

}
