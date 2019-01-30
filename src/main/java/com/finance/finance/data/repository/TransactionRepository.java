package com.finance.finance.data.repository;

import com.finance.finance.data.document.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, Integer> {
}
