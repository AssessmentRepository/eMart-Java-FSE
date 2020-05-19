package com.emart.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emart.entitys.Items;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface ItemsRepository extends MongoRepository<Items, String> {

}
