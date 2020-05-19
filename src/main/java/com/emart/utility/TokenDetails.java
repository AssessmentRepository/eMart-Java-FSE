package com.emart.utility;

/**
 * @author krishnarjun.pampana
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emart.entitys.User;
import com.emart.exceptionutility.BadRequestException;
import com.emart.security.JWTUtil;

@Component
public class TokenDetails {

	@Autowired
	private JWTUtil jwtUtil;
	
    /**
     * role validation
     * @param token
     * @param role
     */
	public void validateUser(String token, String role) {
		User user = jwtUtil.parseToken(token);
		if (!user.getRoles().get(0).getRole().name().equals(role)) {
			throw new BadRequestException("Un Authorized Role to do actions");
		}
	}

	public String getUserName(String token) {
		User user = jwtUtil.parseToken(token);
		return user.getUsername();
	}
}
