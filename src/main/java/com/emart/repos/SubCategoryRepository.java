package com.emart.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emart.entitys.SubCategory;

/**
 * @author B Shashidhar
 *
 * 
 */
@Repository
public interface SubCategoryRepository extends MongoRepository<SubCategory, String> {

}
