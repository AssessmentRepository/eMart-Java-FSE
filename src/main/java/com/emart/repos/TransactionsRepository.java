package com.emart.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emart.entitys.Transactions;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface TransactionsRepository extends MongoRepository<Transactions, String> {

}
