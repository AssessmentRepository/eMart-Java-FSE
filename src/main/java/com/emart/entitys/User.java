package com.emart.entitys;

import java.time.Instant;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Document("users")
public class User extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id = Instant.now().toEpochMilli();

    @Email
	private String username;

    @NotEmpty
    @Pattern(regexp = "{A-Za-z0-9}@$")
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

	public Boolean getUserBlocked() {
		return userBlocked;
	}

	public void setUserBlocked(Boolean userBlocked) {
		this.userBlocked = userBlocked;
	}

	public User() {
	}

	public User(Long id, String username, String password, List<UserRole> roles) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
		this.password = passwordEncoder.encode(password);
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

}
