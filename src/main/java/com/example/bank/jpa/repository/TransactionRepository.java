package com.example.bank.jpa.repository;

import com.example.bank.jpa.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Transaction findTransactionById(Long id);

}
