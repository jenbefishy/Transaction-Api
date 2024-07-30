package pet.com.spring.service;

import pet.com.spring.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Long senderId, Long receiverId, Long amount);
    List<Transaction> getAllTransactions();
}

