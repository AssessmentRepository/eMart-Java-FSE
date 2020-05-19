package com.emart.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emart.entitys.PurchaseHistory;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface PurchaseHistoryRepository extends MongoRepository<PurchaseHistory, String> {

}
