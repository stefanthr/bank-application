package com.example.bank.jpa.repository;

import com.example.bank.jpa.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

  Account findAccountByIban(String iban);

}
