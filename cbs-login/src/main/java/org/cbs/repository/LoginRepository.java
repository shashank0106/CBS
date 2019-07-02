package org.cbs.repository;

import org.cbs.persistence.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<UserCredential,String> {
    public UserCredential findByUserId(String userId);
}
