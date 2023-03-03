package com.example.bank.service;

import com.example.bank.jpa.model.Account;
import com.example.bank.jpa.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account findAccount(Account account) {
        return accountRepository.findAccountByIban(account.getIban());
    }

    @Transactional
    public void addAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }
}
