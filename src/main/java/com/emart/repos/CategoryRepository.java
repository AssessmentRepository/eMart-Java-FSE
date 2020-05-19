package com.emart.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emart.entitys.Category;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface CategoryRepository extends MongoRepository<Category, String> {

}
