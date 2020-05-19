package com.emart.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entitys.User;
import com.emart.exceptionutility.BadRequestException;
import com.emart.repos.UserRepository;
import com.emart.services.UserService;

/**
 * @author krishnarjun.pampana
 */
@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Override
	public Optional<User> getByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void saveUser(User user) {
		if (user == null) {
			throw new BadRequestException("user details is mandatory");
		}
		Optional<User> userDetails = getByUsername(user.getUsername());
		if (userDetails.isPresent()) {
			throw new BadRequestException("user name already exists");
		}
		user.setUserBlocked(Boolean.FALSE);
		this.userRepository.save(user);
	}

	@Override
	public void blockOrUnblockUser(String userName,Boolean value) {

		Optional<User> userDetails = getByUsername(userName);
		if (!userDetails.isPresent()) {
			throw new BadRequestException("user not available or already blocked");
		}
		userDetails.get().setUserBlocked(value);
		this.userRepository.save(userDetails.get());
	}
}
