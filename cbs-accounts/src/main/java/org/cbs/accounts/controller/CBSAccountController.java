package org.cbs.accounts.controller;

import org.cbs.accounts.model.Account;
import org.cbs.accounts.service.CBSAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Accounts")
public class CBSAccountController {

    @Autowired
    private CBSAccountService cbsAccountService;

    @GetMapping
    public List<Account> fetchAccounts(String userId) {

        return cbsAccountService.fetch(userId);

    }


}
