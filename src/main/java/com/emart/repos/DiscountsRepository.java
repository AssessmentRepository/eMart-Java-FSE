package com.emart.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emart.entitys.Discounts;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface DiscountsRepository extends MongoRepository<Discounts, String> {

}
