package org.cbs.service;

import org.cbs.model.UserCredentials;
import org.cbs.persistence.entity.UserCredential;
import org.cbs.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean authenticateUser(UserCredentials userCredentials){
        UserCredential userCredentials1=loginRepository.findByUserId(userCredentials.getUserId());
        return userCredentials.getUserPassword().equals(userCredentials1.getUserPassword());

    }

}
