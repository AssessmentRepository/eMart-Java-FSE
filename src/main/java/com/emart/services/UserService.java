package com.emart.services;

import java.util.Optional;

import com.emart.entitys.User;

/**
 * 
 * @author krishnarjun.pampana
 */
public interface UserService {
	/**
	 * 
	 * @param username
	 * @return
	 */
	public Optional<User> getByUsername(String username);

	/**
	 * 
	 * @param user
	 */
	public void saveUser(User user);

	/**
	 * 
	 * @param userName
	 */
	void blockOrUnblockUser(String userName,Boolean value);
}
