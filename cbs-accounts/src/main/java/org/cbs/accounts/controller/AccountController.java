package org.cbs.accounts.controller;


import org.cbs.accounts.persistence.entity.Account;
import org.cbs.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService cbsAccountService;

    @GetMapping("/{userId}")
    public List<Account> fetchAccounts(@PathVariable("userId") final String userId) {
        return cbsAccountService.fetchAccounts(userId);
    }


}
