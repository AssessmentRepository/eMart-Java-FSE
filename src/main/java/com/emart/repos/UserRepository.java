package com.emart.repos;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emart.entitys.User;

/**
 * UserRepository
 * 
 * @author krishnarjun.pampana
 * 
 *  */
public interface UserRepository extends MongoRepository<User, String> {
	
    public Optional<User> findByUsername(String username);
    
    public Optional<User> findByUsernameAndUserBlocked(String username,Boolean value);

}
