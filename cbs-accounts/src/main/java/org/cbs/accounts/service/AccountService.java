package org.cbs.accounts.service;

import org.cbs.accounts.dao.AccountRepository;
import org.cbs.accounts.persistence.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> fetchAccounts(String userId) {
        return accountRepository.findAccountsByUserId(userId);
    }
}
