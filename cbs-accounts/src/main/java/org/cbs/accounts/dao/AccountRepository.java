package org.cbs.accounts.dao;


import org.cbs.accounts.persistence.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
        public List<Account> findAccountsByUserId(String userId);

}
