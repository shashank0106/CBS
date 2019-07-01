package org.cbs.accounts.service;

import org.cbs.accounts.dao.AccountRepository;
import org.cbs.accounts.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CBSAccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> fetch(String userId) {

       /*return accountRepository.fetch(userId);*/
        return null;
    }
}
